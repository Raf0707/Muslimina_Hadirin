package com.example.alhamdulillah;

import static android.content.Context.MODE_PRIVATE;

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

public class Jest_CounterFragment extends Fragment implements View.OnClickListener {
    private ConstraintLayout jestLayout;
    private Handler handler;
    private int counter = 0;
    private TextView jestCounter;
    private Button bacckmenu;
    private SharedPreferences sPrefff;
    private View vview;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_jest__counter, null);

        jestLayout = view.findViewById(R.id.jestLayout);
        handler = new Handler();
        jestCounter = view.findViewById(R.id.jestCount);
        bacckmenu = view.findViewById(R.id.bacckmenu);
        bacckmenu.setOnClickListener(this);

        Thread t = new Thread(() -> {
            try{
                TimeUnit.MILLISECONDS.sleep(100);
                handler.post(r);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        });

        t.start();

        view.setOnTouchListener(new OnSwipeTouchListener(view.getContext()) {

            int countClick = 0;

            @Override
            public void onSwipeRight() {
                counter++;
                jestCounter.setText(Integer.toString(counter));
                saveText();
            }

            @Override
            public void onSwipeLeft() {
                if (counter > 0) counter--;
                jestCounter.setText(Integer.toString(counter));
                saveText();
            }

            @Override
            public void onSwipeUp() {
                if (counter > 0) counter--;
                jestCounter.setText(Integer.toString(counter));
                saveText();
            }

            @Override
            public void onSwipeDown() {
                counter++;
                jestCounter.setText(Integer.toString(counter));
                saveText();
            }

            @Override
            public void onClick() {
                countClick = 1;
                counter++;
                jestCounter.setText(Integer.toString(counter));
                saveText();
            }

            @Override
            public void onDoubleClick() {
                countClick = 1;
                counter++;
                jestCounter.setText(Integer.toString(counter));
                saveText();

            }

            @Override
            public void onLongClick() {
                if (counter != 0 && jestCounter.getText().toString() != "0") onAlert();
                saveText();
            }

        });

        loadText();

        return view;
    }

    Runnable r = new Runnable() {
        public void run(){
            jestCounter.setText(Integer.toString(counter));
            handler.postDelayed(r,100);
        }
    };

    @Override
    public void onClick(View view) {
        saveText();
        Intent bacckkmenu = new Intent(getContext(), MainActivity.class);
        startActivity(bacckkmenu);
        loadText();

    }

    public void saveText() {
        sPrefff = getActivity().getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPrefff.edit();
        ed.putString("Сделалл", jestCounter.getText().toString());
        counter = Integer.parseInt(jestCounter.getText().toString());
        ed.apply();
    }

    public void loadText() {
        sPrefff = getActivity().getPreferences(MODE_PRIVATE);
        String sdellText = sPrefff.getString("Сделалл", jestCounter.getText().toString());
        jestCounter.setText(sdellText);
        counter = Integer.parseInt(jestCounter.getText().toString());
    }

    public void onAlert() {
        AlertDialog.Builder builder1 = new AlertDialog.Builder(getContext());
        builder1.setMessage("Вы уверены, что хотите сбросить счетчик?");
        builder1.setCancelable(true);

        builder1.setPositiveButton(
                "Да", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        counter = 0;
                        jestCounter.setText(Integer.toString(counter));
                        saveText();
                        loadText();
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

    @Override
    public void onDestroy() {
        saveText();
        loadText();
        super.onDestroy();
    }

}