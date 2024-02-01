package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.topjohnwu.magisk.R;
import java.util.WeakHashMap;
import p000a.AbstractC0095Bq;
import p000a.AbstractC0795Op;
import p000a.AbstractC1090US;
import p000a.AbstractC2446u3;
import p000a.InterfaceC1758h1;

/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout implements InterfaceC1758h1 {

    /* renamed from: I */
    public int f9427I;

    /* renamed from: R */
    public Button f9428R;

    /* renamed from: S */
    public TextView f9429S;

    /* renamed from: w */
    public final TimeInterpolator f9430w;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9430w = AbstractC0795Op.m1802BO(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC1090US.f3562h);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f9429S = (TextView) findViewById(R.id.snackbar_text);
        this.f9428R = (Button) findViewById(R.id.snackbar_action);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0049, code lost:
    
        if (m5079z(1, r0, r0 - r2) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0054, code lost:
    
        if (m5079z(0, r0, r0) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0057, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0058, code lost:
    
        if (r1 == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x005a, code lost:
    
        super.onMeasure(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x005d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
    
        return;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.getOrientation()
            r1 = 1
            if (r0 != r1) goto Lb
            return
        Lb:
            android.content.res.Resources r0 = r7.getResources()
            r2 = 2131165330(0x7f070092, float:1.7944874E38)
            int r0 = r0.getDimensionPixelSize(r2)
            android.content.res.Resources r2 = r7.getResources()
            r3 = 2131165329(0x7f070091, float:1.7944872E38)
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.TextView r3 = r7.f9429S
            android.text.Layout r3 = r3.getLayout()
            r4 = 0
            if (r3 == 0) goto L32
            int r3 = r3.getLineCount()
            if (r3 <= r1) goto L32
            r3 = r1
            goto L33
        L32:
            r3 = r4
        L33:
            if (r3 == 0) goto L4c
            int r5 = r7.f9427I
            if (r5 <= 0) goto L4c
            android.widget.Button r5 = r7.f9428R
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f9427I
            if (r5 <= r6) goto L4c
            int r2 = r0 - r2
            boolean r0 = r7.m5079z(r1, r0, r2)
            if (r0 == 0) goto L57
            goto L58
        L4c:
            if (r3 == 0) goto L4f
            goto L50
        L4f:
            r0 = r2
        L50:
            boolean r0 = r7.m5079z(r4, r0, r0)
            if (r0 == 0) goto L57
            goto L58
        L57:
            r1 = r4
        L58:
            if (r1 == 0) goto L5d
            super.onMeasure(r8, r9)
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    /* renamed from: z */
    public final boolean m5079z(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f9429S.getPaddingTop() == i2 && this.f9429S.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.f9429S;
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        if (AbstractC0095Bq.m204u(textView)) {
            AbstractC0095Bq.m197M(textView, AbstractC0095Bq.m200Q(textView), i2, AbstractC0095Bq.m198N(textView), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }
}
