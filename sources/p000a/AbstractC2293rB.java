package p000a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.CompoundButton;

/* renamed from: a.rB */
/* loaded from: classes.dex */
public abstract class AbstractC2293rB {
    /* renamed from: P */
    public static void m3950P(CompoundButton compoundButton, PorterDuff.Mode mode) {
        compoundButton.setButtonTintMode(mode);
    }

    /* renamed from: h */
    public static PorterDuff.Mode m3951h(CompoundButton compoundButton) {
        return compoundButton.getButtonTintMode();
    }

    /* renamed from: v */
    public static void m3952v(CompoundButton compoundButton, ColorStateList colorStateList) {
        compoundButton.setButtonTintList(colorStateList);
    }

    /* renamed from: z */
    public static ColorStateList m3953z(CompoundButton compoundButton) {
        return compoundButton.getButtonTintList();
    }
}
