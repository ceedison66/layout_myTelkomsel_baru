package com.example.ui_belanja;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link isiFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class isiFragment extends Fragment {


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public isiFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment isiFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static isiFragment newInstance(String param1, String param2) {
        isiFragment fragment = new isiFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_isi,null,false);

        final Button btn_fragment_isi = view.findViewById(R.id.btn_isi);
        Button btn_fragment_isi2 = view.findViewById(R.id.btn_isi2);
        Button btn_fragment_kirim = view.findViewById(R.id.btn_kirim);
        Button btn_fragment_kirim2 = view.findViewById(R.id.btn_kirim2);

        final RelativeLayout expandableView = view.findViewById(R.id.tambahan_isi);
        final RelativeLayout expandableView4 = view.findViewById(R.id.tambahan_kirim);


        final RelativeLayout expandableView2 = view.findViewById(R.id.card_kirim);
        final RelativeLayout expandableView3 = view.findViewById(R.id.card_isi);

        final CardView cardView_isi = view.findViewById(R.id.cardview_isi);
        final CardView cardView_kirim = view.findViewById(R.id.cardview_kirim);


        btn_fragment_isi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity().getApplicationContext(),"Isi",Toast.LENGTH_SHORT).show();
                if(expandableView.getVisibility()==View.GONE){
                    expandableView.setVisibility(View.VISIBLE);
                    expandableView2.setVisibility(View.GONE);
                    expandableView3.setVisibility(View.GONE);
                    cardView_isi.setVisibility(View.GONE);
                    cardView_kirim.setVisibility(View.GONE);
                }else{
                    expandableView.setVisibility(View.GONE);
                    expandableView2.setVisibility(View.VISIBLE);
                    expandableView3.setVisibility(View.VISIBLE);
                    cardView_isi.setVisibility(View.VISIBLE);
                    cardView_kirim.setVisibility(View.VISIBLE);
                }
            }
        });

        btn_fragment_isi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity().getApplicationContext(),"Isi",Toast.LENGTH_SHORT).show();
                if(expandableView.getVisibility()==View.VISIBLE){
                    expandableView.setVisibility(View.GONE);
                    expandableView2.setVisibility(View.VISIBLE);
                    expandableView3.setVisibility(View.VISIBLE);
                    cardView_isi.setVisibility(View.VISIBLE);
                    cardView_kirim.setVisibility(View.VISIBLE);
                }else{
                    expandableView.setVisibility(View.VISIBLE);
                    expandableView2.setVisibility(View.GONE);
                    expandableView3.setVisibility(View.GONE);
                    cardView_isi.setVisibility(View.GONE);
                    cardView_kirim.setVisibility(View.GONE);
                }
            }
        });



        btn_fragment_kirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity().getApplicationContext(),"Kirim",Toast.LENGTH_SHORT).show();
                if(expandableView4.getVisibility()==View.GONE){
                    expandableView4.setVisibility(View.VISIBLE);
                    expandableView2.setVisibility(View.GONE);
                    expandableView3.setVisibility(View.GONE);
                    cardView_isi.setVisibility(View.GONE);
                    cardView_kirim.setVisibility(View.GONE);
                }else{
                    expandableView4.setVisibility(View.GONE);
                    expandableView2.setVisibility(View.VISIBLE);
                    expandableView3.setVisibility(View.VISIBLE);
                    cardView_isi.setVisibility(View.VISIBLE);
                    cardView_kirim.setVisibility(View.VISIBLE);
                }

            }
        });

        btn_fragment_kirim2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity().getApplicationContext(),"Kirim",Toast.LENGTH_SHORT).show();
                if(expandableView4.getVisibility()==View.VISIBLE){
                    expandableView4.setVisibility(View.GONE);
                    expandableView2.setVisibility(View.VISIBLE);
                    expandableView3.setVisibility(View.VISIBLE);
                    cardView_isi.setVisibility(View.VISIBLE);
                    cardView_kirim.setVisibility(View.VISIBLE);
                }else{
                    expandableView4.setVisibility(View.VISIBLE);
                    expandableView2.setVisibility(View.GONE);
                    expandableView3.setVisibility(View.GONE);
                    cardView_isi.setVisibility(View.GONE);
                    cardView_kirim.setVisibility(View.GONE);
                }

            }
        });


        return view;
    }
}
