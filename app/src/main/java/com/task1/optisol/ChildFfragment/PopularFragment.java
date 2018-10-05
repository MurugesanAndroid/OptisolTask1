package com.task1.optisol.ChildFfragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import com.task1.optisol.ExpandableAdapter;
import com.task1.optisol.R;
import com.task1.optisol.Utilkit;
import com.task1.optisol.models.Model;
import com.task1.optisol.retrofit.ServiceGenerator;
import com.task1.optisol.retrofit.WebService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class PopularFragment extends Fragment {

    ExpandableListView exp_lv ;
    ExpandableAdapter expandableAdapter;
    Context mContext;
    Model model;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext=getContext();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_popular,container,false);

        exp_lv=view.findViewById(R.id.exp_lv);

        callGetService();
        return view;
    }



    /**
     * Here Calling Network API
     */
    private void callGetService() {
        Utilkit.showSpinnerDialog(mContext, false);
        WebService webServiceObj;
        webServiceObj = ServiceGenerator.createService(WebService.class);
        Call<Model> call = webServiceObj.callGetService();
        call.enqueue(new Callback<Model>() {
            @Override
            public void onResponse(Call<Model> call, Response<Model> response) {
                Utilkit.dismisssSpinnerDialog();
                try{
                    model = response.body();

                    expandableAdapter=new ExpandableAdapter(mContext,model);
                    exp_lv.setAdapter(expandableAdapter);

                }catch (Exception e){
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<Model> call, Throwable t) {
                Utilkit.dismisssSpinnerDialog();
            }
        });
    }

}
