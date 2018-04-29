package ua.lelpel.coloredcircles;

import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import ua.lelpel.coloredcircles.CircleFragment.OnListFragmentInteractionListener;

/**
 * {@link RecyclerView.Adapter} that can display a {@link Data#getRandNumbers()} and makes a call to the
 * specified {@link OnListFragmentInteractionListener}.
 */
public class CirclesRecyclerViewAdapter extends RecyclerView.Adapter<CirclesRecyclerViewAdapter.ViewHolder> {

    private final List<Integer> mValues;
    private final OnListFragmentInteractionListener mListener;
    private ResourceManager resourceManager;

    public CirclesRecyclerViewAdapter(List<Integer> items, OnListFragmentInteractionListener listener, ResourceManager resourceManager) {
        mValues = items;
        mListener = listener;
        this.resourceManager = resourceManager;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_circle, parent, false);
        return new ViewHolder(view, resourceManager);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.bind(Integer.toString(mValues.get(position)));

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    mListener.onListFragmentInteraction(holder.mNumber);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        final View mView;
        final TextView mNumberView;
        private ResourceManager resourceManager;
        String mNumber;

        ViewHolder(View view, ResourceManager resourceManager) {
            super(view);
            mView = view;
            mNumberView = view.findViewById(R.id.id);
            this.resourceManager = resourceManager;
        }

        void bind(String text) {
            mNumber = text;

            GradientDrawable drawable = (GradientDrawable) resourceManager.getDrawable(R.drawable.circle);
            drawable.setColor(resourceManager.getColor(Data.getRandColor()));
            mNumberView.setBackground(drawable);
            mNumberView.setText(mNumber);
        }
    }
}
