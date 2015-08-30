package com.google.android.apps.watchme;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Fernando Bessa on 8/30/2015.
 */
public class StreamAdapter extends RecyclerView.Adapter<StreamAdapter.StreamViewHolder> {

        private List<StreamInfo> streamList;

        public StreamAdapter(List<StreamInfo> streamList) {
            this.streamList = streamList;
        }

        @Override
        public int getItemCount() {
            return streamList.size();
        }

        @Override
        public void onBindViewHolder(StreamViewHolder contactViewHolder, int i) {
            StreamInfo si = streamList.get(i);
            contactViewHolder.icon.setImageDrawable(si.icon);
            contactViewHolder.streamName.setText(si.streamName);
            contactViewHolder.streamDescription.setText(si.streamDescription);
        }

        @Override
        public StreamViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View itemView = LayoutInflater.
                    from(viewGroup.getContext()).
                    inflate(R.layout.card_view_streams_watch, viewGroup, false);

            return new StreamViewHolder(itemView);
        }

        public static class StreamViewHolder extends RecyclerView.ViewHolder {

            protected ImageView icon;
            protected TextView streamName;
            protected TextView streamDescription;

            public StreamViewHolder(View v) {
                super(v);
                icon =  (ImageView) v.findViewById(R.id.stream_icon);
                streamName = (TextView)  v.findViewById(R.id.stream_name);
                streamDescription = (TextView)  v.findViewById(R.id.stream_desc);
            }
        }
}
