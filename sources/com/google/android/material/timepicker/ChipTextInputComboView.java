package com.google.android.material.timepicker;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import com.topjohnwu.magisk.R;
import java.util.WeakHashMap;
import p000a.AbstractC0095Bq;
import p000a.AbstractC2446u3;

/* loaded from: classes.dex */
public class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: R */
    public final EditText f9513R;

    /* renamed from: S */
    public final Chip f9514S;

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LocaleList locales;
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.f9514S = chip;
        chip.f9322H = "android.view.View";
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        EditText editText = textInputLayout.f9453I;
        this.f9513R = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new C2780z(this));
        if (Build.VERSION.SDK_INT >= 24) {
            locales = getContext().getResources().getConfiguration().getLocales();
            editText.setImeHintLocales(locales);
        }
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(R.id.material_label);
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        editText.setId(AbstractC0095Bq.m206z());
        AbstractC0095Bq.m203o(textView, editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    /* renamed from: z */
    public static String m5111z(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        try {
            return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f9514S.isChecked();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        LocaleList locales;
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 24) {
            locales = getContext().getResources().getConfiguration().getLocales();
            this.f9513R.setImeHintLocales(locales);
        }
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        int i;
        Chip chip = this.f9514S;
        chip.setChecked(z);
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        final EditText editText = this.f9513R;
        editText.setVisibility(i);
        if (z) {
            i2 = 8;
        }
        chip.setVisibility(i2);
        if (isChecked()) {
            editText.requestFocus();
            editText.post(new Runnable() { // from class: a.dc

                /* renamed from: R */
                public final /* synthetic */ boolean f4849R = false;

                @Override // java.lang.Runnable
                public final void run() {
                    C0935Rb c0935Rb;
                    boolean z2 = this.f4849R;
                    View view = editText;
                    if (z2) {
                        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                        if (Build.VERSION.SDK_INT >= 30) {
                            c0935Rb = AbstractC0569Kg.m1289v(view);
                        } else {
                            Context context = view.getContext();
                            while (true) {
                                if (!(context instanceof ContextWrapper)) {
                                    break;
                                }
                                if (context instanceof Activity) {
                                    Window window = ((Activity) context).getWindow();
                                    if (window != null) {
                                        c0935Rb = new C0935Rb(window, view);
                                    }
                                } else {
                                    context = ((ContextWrapper) context).getBaseContext();
                                }
                            }
                            c0935Rb = null;
                        }
                        if (c0935Rb != null) {
                            c0935Rb.f3211z.mo1263Y();
                            return;
                        }
                    }
                    Context context2 = view.getContext();
                    Object obj = AbstractC0865QC.f2950z;
                    ((InputMethodManager) AbstractC1375Zj.m2770h(context2, InputMethodManager.class)).showSoftInput(view, 1);
                }
            });
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f9514S.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        this.f9514S.setTag(i, obj);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.f9514S.toggle();
    }
}
