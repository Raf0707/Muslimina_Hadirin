package com.example.alhamdulillah;

import android.content.*;
import android.os.*;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

import java.util.concurrent.*;


public class PostRamadanFragment extends Fragment implements View.OnClickListener {
    private Handler handler;
    private int countCheck = 0;
    private TextView itog;

    private ProgressBar postProgressBar;

    private Button reset;
    private Button menu;

    private CheckBox c1;
    private CheckBox c2;
    private CheckBox c3;
    private CheckBox c4;
    private CheckBox c5;
    private CheckBox c6;
    private CheckBox c7;
    private CheckBox c8;
    private CheckBox c9;
    private CheckBox c10;
    private CheckBox c11;
    private CheckBox c12;
    private CheckBox c13;
    private CheckBox c14;
    private CheckBox c15;
    private CheckBox c16;
    private CheckBox c17;
    private CheckBox c18;
    private CheckBox c19;
    private CheckBox c20;
    private CheckBox c21;
    private CheckBox c22;
    private CheckBox c23;
    private CheckBox c24;
    private CheckBox c25;
    private CheckBox c26;
    private CheckBox c27;
    private CheckBox c28;
    private CheckBox c29;
    private CheckBox c30;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_post_ramadan, null);

        itog = view.findViewById(R.id.itoooog);

        postProgressBar = view.findViewById(R.id.postProgressBar);

        reset = view.findViewById(R.id.button_reset);
        menu = view.findViewById(R.id.button_menu);

        reset.setOnClickListener(this);
        menu.setOnClickListener(this);

        c1 = view.findViewById(R.id.r1);
        c2 = view.findViewById(R.id.r2);
        c3 = view.findViewById(R.id.r3);
        c4 = view.findViewById(R.id.r4);
        c5 = view.findViewById(R.id.r5);
        c6 = view.findViewById(R.id.r6);
        c7 = view.findViewById(R.id.r7);
        c8 = view.findViewById(R.id.r8);
        c9 = view.findViewById(R.id.r9);
        c10 = view.findViewById(R.id.r10);
        c11 = view.findViewById(R.id.r11);
        c12 = view.findViewById(R.id.r12);
        c13 = view.findViewById(R.id.r13);
        c14 = view.findViewById(R.id.r14);
        c15 = view.findViewById(R.id.r15);
        c16 = view.findViewById(R.id.r16);
        c17 = view.findViewById(R.id.r17);
        c18 = view.findViewById(R.id.r18);
        c19 = view.findViewById(R.id.r19);
        c20 = view.findViewById(R.id.r20);
        c21 = view.findViewById(R.id.r21);
        c22 = view.findViewById(R.id.r22);
        c23 = view.findViewById(R.id.r23);
        c24 = view.findViewById(R.id.r24);
        c25 = view.findViewById(R.id.r25);
        c26 = view.findViewById(R.id.r26);
        c27 = view.findViewById(R.id.r27);
        c28 = view.findViewById(R.id.r28);
        c29 = view.findViewById(R.id.r29);
        c30 = view.findViewById(R.id.r30);


        this.c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                onCountCheck(isChecked);
            }
        });

        this.c2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                onCountCheck(isChecked);
            }
        });

        this.c3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                onCountCheck(isChecked);
            }
        });

        this.c4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                onCountCheck(isChecked);
            }
        });

        this.c5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                onCountCheck(isChecked);
            }
        });

        this.c6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                onCountCheck(isChecked);
            }
        });

        this.c7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                onCountCheck(isChecked);
            }
        });

        this.c8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                onCountCheck(isChecked);
            }
        });

        this.c9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                onCountCheck(isChecked);
            }
        });

        this.c10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                onCountCheck(isChecked);
            }
        });

        this.c11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                onCountCheck(isChecked);
            }
        });

        this.c12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                onCountCheck(isChecked);
            }
        });

        this.c13.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                onCountCheck(isChecked);
            }
        });

        this.c14.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                onCountCheck(isChecked);
            }
        });

        this.c15.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                onCountCheck(isChecked);
            }
        });

        this.c16.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                onCountCheck(isChecked);
            }
        });

        this.c17.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                onCountCheck(isChecked);
            }
        });

        this.c18.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                onCountCheck(isChecked);
            }
        });

        this.c19.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                onCountCheck(isChecked);
            }
        });

        this.c20.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                onCountCheck(isChecked);
            }
        });

        this.c21.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                onCountCheck(isChecked);
            }
        });

        this.c22.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                onCountCheck(isChecked);
            }
        });

        this.c23.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                onCountCheck(isChecked);
            }
        });

        this.c24.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                onCountCheck(isChecked);
            }
        });

        this.c25.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                onCountCheck(isChecked);
            }
        });

        this.c26.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                onCountCheck(isChecked);
            }
        });

        this.c27.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                onCountCheck(isChecked);
            }
        });

        this.c28.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                onCountCheck(isChecked);
            }
        });

        this.c29.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                onCountCheck(isChecked);
            }
        });

        this.c30.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                onCountCheck(isChecked);
            }
        });


        return view;
    }

    public void onCountCheck(boolean isChecked) {
        if (isChecked) {
            countCheck++;
            itog.setText(Integer.toString(countCheck));
            postProgressBar.setProgress(countCheck);
        }
        if (!isChecked && countCheck != 0) {
            countCheck--;
            if (countCheck < 0) countCheck = 0;
            itog.setText(Integer.toString(countCheck));
            postProgressBar.setProgress(countCheck);
        }
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_reset:
                this.c1.setChecked(false);
                this.c2.setChecked(false);
                this.c3.setChecked(false);
                this.c4.setChecked(false);
                this.c5.setChecked(false);
                this.c6.setChecked(false);
                this.c7.setChecked(false);
                this.c8.setChecked(false);
                this.c9.setChecked(false);
                this.c10.setChecked(false);
                this.c11.setChecked(false);
                this.c12.setChecked(false);
                this.c13.setChecked(false);
                this.c14.setChecked(false);
                this.c15.setChecked(false);
                this.c16.setChecked(false);
                this.c17.setChecked(false);
                this.c18.setChecked(false);
                this.c19.setChecked(false);
                this.c20.setChecked(false);
                this.c21.setChecked(false);
                this.c22.setChecked(false);
                this.c23.setChecked(false);
                this.c24.setChecked(false);
                this.c25.setChecked(false);
                this.c26.setChecked(false);
                this.c27.setChecked(false);
                this.c28.setChecked(false);
                this.c29.setChecked(false);
                this.c30.setChecked(false);

                break;

            case R.id.button_menu:
                Intent intent = new Intent(getContext(), MainActivity.class);
                startActivity(intent);
                break;


        }
    }
}

