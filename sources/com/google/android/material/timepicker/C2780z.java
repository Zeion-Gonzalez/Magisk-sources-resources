package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;
import p000a.AbstractC2117nw;

/* renamed from: com.google.android.material.timepicker.z */
/* loaded from: classes.dex */
public final class C2780z extends AbstractC2117nw {

    /* renamed from: S */
    public final /* synthetic */ ChipTextInputComboView f9550S;

    public C2780z(ChipTextInputComboView chipTextInputComboView) {
        this.f9550S = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean isEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f9550S;
        if (isEmpty) {
            chipTextInputComboView.f9514S.setText(ChipTextInputComboView.m5111z(chipTextInputComboView, "00"));
            return;
        }
        String m5111z = ChipTextInputComboView.m5111z(chipTextInputComboView, editable);
        Chip chip = chipTextInputComboView.f9514S;
        if (TextUtils.isEmpty(m5111z)) {
            m5111z = ChipTextInputComboView.m5111z(chipTextInputComboView, "00");
        }
        chip.setText(m5111z);
    }
}
