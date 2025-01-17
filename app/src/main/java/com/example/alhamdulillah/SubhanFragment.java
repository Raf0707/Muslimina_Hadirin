package com.example.alhamdulillah;

import static android.content.Context.MODE_PRIVATE;

import static com.example.alhamdulillah.AllahNamesFragment.context;

import android.app.*;
import android.content.*;
import android.os.*;

import androidx.constraintlayout.widget.*;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

import java.util.concurrent.*;


public class SubhanFragment extends Fragment implements View.OnClickListener {
    private ConstraintLayout subhanLayout;
    private Handler handler;
    private int counter = 0;
    private TextView subhanCounter;
    private Button bacckmenusss;
    private SharedPreferences sssPrefff;
    private TextView subhanLlahBiHamdih;
    private TextView translateSubhanLlahBiHamdih;
    private TextView generateTsel;
    private int tselCount;
    View vview;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        
        View view = inflater.inflate(R.layout.fragment_subhan, null);

        subhanLayout = view.findViewById(R.id.subhanLayout);
        handler = new Handler();
        subhanCounter = view.findViewById(R.id.subhanCount);
        bacckmenusss = view.findViewById(R.id.bacckmenusss);
        bacckmenusss.setOnClickListener(this);

        subhanLlahBiHamdih = view.findViewById(R.id.subhanLlahBiHamdih);
        translateSubhanLlahBiHamdih = view.findViewById(R.id.translateSubhanLlahBiHamdih);

        generateTsel = view.findViewById(R.id.subhanCountGenerateTsel);

        generateTsel.setText(getRandomTsel(146325749, 938789359));
        tselCount = Integer.parseInt(generateTsel.getText().toString());
        final int ccount = Integer.parseInt(generateTsel.getText().toString());

        Thread t = new Thread(() -> {
            try{
                TimeUnit.MILLISECONDS.sleep(10);
                handler.post(r);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        });

        t.start();


        subhanLayout.setOnTouchListener(new OnSwipeTouchListener(view.getContext()) {

            @Override
            public void onSwipeRight() {
                saveText();
                counter++;
                if (tselCount > 0) tselCount--;
                subhanCounter.setText(Integer.toString(counter));
                generateTsel.setText(Integer.toString(tselCount));
                saveText();
                loadText();
            }

            @Override
            public void onSwipeLeft() {
                saveText();
                if (counter > 0) counter--;
                tselCount++;
                subhanCounter.setText(Integer.toString(counter));
                generateTsel.setText(Integer.toString(tselCount));
                saveText();
                loadText();
            }

            @Override
            public void onSwipeUp() {
                saveText();
                if (counter > 0) counter--;
                tselCount++;
                subhanCounter.setText(Integer.toString(counter));
                generateTsel.setText(Integer.toString(tselCount));
                saveText();
                loadText();
            }

            @Override
            public void onSwipeDown() {
                saveText();
                counter++;
                if (tselCount > 0) tselCount--;
                subhanCounter.setText(Integer.toString(counter));
                generateTsel.setText(Integer.toString(tselCount));
                saveText();
                loadText();
            }

            @Override
            public void onClick() {
                saveText();
                counter++;
                if (tselCount > 0) tselCount--;
                subhanCounter.setText(Integer.toString(counter));
                generateTsel.setText(Integer.toString(tselCount));
                saveText();
                loadText();

            }

            @Override
            public void onLongClick() {
                saveText();
                onAlert();
                saveText();
                loadText();
            }

        });

        loadText();

        return view;
    }

    Runnable r = new Runnable() {
        public void run(){
            subhanCounter.setText(Integer.toString(counter));
            handler.postDelayed(r,10);
        }
    };

    @Override
    public void onClick(View view) {
        saveText();
        Intent bacckkmenu = new Intent(getContext(), MainActivity.class);
        startActivity(bacckkmenu);
        loadText();

    }

    public static String getRandomTsel(int min, int max){
        int x = (int) ((Math.random() * ((max - min) + 1)) + min);
        return Integer.toString(x);
    }

    public void saveText() {
        sssPrefff = getActivity().getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sssPrefff.edit();
        ed.putString("Сделаллсс", subhanCounter.getText().toString());
        ed.putString("Осталосьь", generateTsel.getText().toString());
        counter = Integer.parseInt(subhanCounter.getText().toString());
        tselCount = Integer.parseInt(generateTsel.getText().toString());
        ed.apply();
    }

    public void loadText() {
        sssPrefff = getActivity().getPreferences(MODE_PRIVATE);
        String sdellText = sssPrefff.getString("Сделаллсс", subhanCounter.getText().toString());
        String ossstText = sssPrefff.getString("Осталосьь", generateTsel.getText().toString());
        subhanCounter.setText(sdellText);
        generateTsel.setText(ossstText);
        counter = Integer.parseInt(subhanCounter.getText().toString());
        tselCount = Integer.parseInt(generateTsel.getText().toString());
    }

    public void onAlert() {
        AlertDialog.Builder builder1 = new AlertDialog.Builder(getContext());
        builder1.setMessage("Вы уверены, что хотите сбросить счетчик?");
        builder1.setCancelable(true);

        builder1.setPositiveButton(
                "Да", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        counter = 0;
                        subhanCounter.setText(Integer.toString(counter));
                    }
                });

        builder1.setNegativeButton(
                "Отмена", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

        vview = getLayoutInflater().inflate(R.layout.alert_dialog_counter, null);
        builder1.setView(vview);
        AlertDialog alert11 = builder1.create();
        alert11.getWindow().setLayout(400,800);
        alert11.setTitle("Reset");
        alert11.show();
    }

//    public Dialog onCreateDialog(Bundle savedInstanceState) {
//
//        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
//        return builder
//                .setTitle("Диалоговое окно")
//                .setIcon(android.R.drawable.ic_dialog_alert)
//                .setMessage("Для закрытия окна нажмите ОК")
//                .setPositiveButton("OK", null)
//                .setNegativeButton("Отмена", null)
//                .create();
//    }

    @Override
    public void onDestroy() {
        saveText();
        loadText();
        super.onDestroy();
    }

}
