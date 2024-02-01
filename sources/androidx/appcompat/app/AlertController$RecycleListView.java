package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import p000a.AbstractC0483J5;

/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: R */
    public final int f8669R;

    /* renamed from: S */
    public final int f8670S;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0483J5.f1625y);
        this.f8669R = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f8670S = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
