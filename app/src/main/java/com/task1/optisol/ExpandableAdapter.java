package com.task1.optisol;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.task1.optisol.models.Model;

import de.hdodenhof.circleimageview.CircleImageView;

public class ExpandableAdapter extends BaseExpandableListAdapter {

    private Context mContext;
    private CircleImageView circle_image;
    private TextView name, months, comments, place;
    private Model model;


    public ExpandableAdapter(Context context, Model model) {
        this.mContext = context;
        this.model = model;
    }

    @Override
    public int getGroupCount() {
        return model.getData().size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        int childCount = 0;
        if (model.getData().get(groupPosition) != null) {
            childCount = 1;
        }
        return childCount;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return null;
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return null;
    }

    @Override
    public long getGroupId(int groupPosition) {
        return 0;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.header_exp_listview, parent, false);
        }
        circle_image = convertView.findViewById(R.id.circle_image);
        name = convertView.findViewById(R.id.name);
        place = convertView.findViewById(R.id.place);
        comments = convertView.findViewById(R.id.comments);
        months = convertView.findViewById(R.id.months);


        name.setText(model.getData().get(groupPosition).getEvent_name());
        /*
        Api Data missing
         */
        //place.setText(model.getData().get(groupPosition).getEvent_name());
        //comments.setText(model.getData().get(groupPosition).getEvent_name());
       // months.setText(model.getData().get(groupPosition).getEvent_name());

        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.child_listview, parent, false);
        TextView child_place = view.findViewById(R.id.child_place);
        TextView child_comments = view.findViewById(R.id.child_comments);
        ImageView child_image=view.findViewById(R.id.child_image);

        String baseUrl = "http://d25jwrqpnjo0xm.cloudfront.net/" + model.getData().get(groupPosition).getEventPics().get(childPosition).getKeyname();

        if(null!=baseUrl) {
            Picasso.with(mContext)
                    .load(baseUrl)
                    .placeholder(R.drawable.loading)
                    .resize(700, 400)
                    .centerCrop()
                    .into(child_image);
        }
        return view;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }


}
