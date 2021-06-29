 package com.example.itegy.Fragments;

 import android.content.Intent;
 import android.os.Bundle;
 import android.view.LayoutInflater;
 import android.view.View;
 import android.view.ViewGroup;

 import androidx.cardview.widget.CardView;
 import androidx.fragment.app.Fragment;
 import androidx.recyclerview.widget.LinearLayoutManager;
 import androidx.recyclerview.widget.RecyclerView;

 import com.example.itegy.CdActivity;
 import com.example.itegy.DesktopActivity;
 import com.example.itegy.HarddiskActivity;
 import com.example.itegy.LabtopActivity;
 import com.example.itegy.OfferActivity;
 import com.example.itegy.PrinterActivity;
 import com.example.itegy.R;
 import com.example.itegy.ServerActivity;

 import static android.view.View.OnClickListener;
 import static com.example.itegy.R.id.labtops;
 import static com.example.itegy.R.id.offers_;
 import static com.example.itegy.R.id.servers;

 public class HomeFragment extends Fragment {
     RecyclerView recyclerView;
     Intent intent;

     View view;

     public View onCreateView(LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {
           view = inflater.inflate(R.layout.fragment_home,container,false);
          //  recyclerView= view.findViewById(R.id.recycler_view);
            //recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));


         Intent intent0=new Intent(getActivity(), OfferActivity.class);
         final CardView offer = (CardView)view.findViewById(offers_);
         offer.setOnClickListener(new OnClickListener() {
             @Override
             public void onClick(View v) { startActivity(intent0); }});


         Intent intent1=new Intent(getActivity(), LabtopActivity.class);
         final CardView labtop= (CardView)view.findViewById(labtops);
         labtop.setOnClickListener(new OnClickListener() {
             @Override
             public void onClick(View v) { startActivity(intent1); }});




         Intent intent2=new Intent(getActivity(), ServerActivity.class);
         final CardView server= (CardView)view.findViewById(servers);
         server.setOnClickListener(new OnClickListener() {
             @Override
             public void onClick(View v) { startActivity(intent2); }});


         Intent intent3=new Intent(getActivity(), PrinterActivity.class);
         final CardView printer= (CardView)view.findViewById(R.id.printer);
         printer.setOnClickListener(new OnClickListener() {
             @Override
             public void onClick(View v) { startActivity(intent3); }});


         Intent  intent4=new Intent(getActivity(), DesktopActivity.class);
         final CardView desktop = (CardView)view.findViewById(R.id.desktop);
         desktop.setOnClickListener(new OnClickListener() {
             @Override
             public void onClick(View v) { startActivity(intent4); }});



         Intent  intent5=new Intent(getActivity(), HarddiskActivity.class);
         final CardView harddisk = (CardView)view.findViewById(R.id.harddisk);
         harddisk.setOnClickListener(new OnClickListener() {
             @Override
             public void onClick(View v) { startActivity(intent5); }});






         Intent intent6=new Intent(getActivity(), CdActivity.class);
         final CardView cd = (CardView)view.findViewById(R.id.cd);
         cd.setOnClickListener(new OnClickListener() {
             @Override
             public void onClick(View v) { startActivity(intent6); }});




         return view;
     }



 }