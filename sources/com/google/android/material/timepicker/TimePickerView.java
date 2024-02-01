package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.topjohnwu.magisk.R;
import p000a.ViewOnTouchListenerC0201Dq;

/* loaded from: classes.dex */
public class TimePickerView extends ConstraintLayout {

    /* renamed from: e */
    public static final /* synthetic */ int f9546e = 0;

    /* renamed from: H */
    public final Chip f9547H;

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ViewOnClickListenerC2775N viewOnClickListenerC2775N = new ViewOnClickListenerC2775N(this);
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        ClockFaceView clockFaceView = (ClockFaceView) findViewById(R.id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        materialButtonToggleGroup.f9307w.add(new C2776P(this));
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        this.f9547H = chip2;
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        ViewOnTouchListenerC0201Dq viewOnTouchListenerC0201Dq = new ViewOnTouchListenerC0201Dq(new GestureDetector(getContext(), new C2777Q(this)));
        chip.setOnTouchListener(viewOnTouchListenerC0201Dq);
        chip2.setOnTouchListener(viewOnTouchListenerC0201Dq);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(viewOnClickListenerC2775N);
        chip2.setOnClickListener(viewOnClickListenerC2775N);
        chip.f9322H = "android.view.View";
        chip2.f9322H = "android.view.View";
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.f9547H.sendAccessibilityEvent(8);
        }
    }
}
