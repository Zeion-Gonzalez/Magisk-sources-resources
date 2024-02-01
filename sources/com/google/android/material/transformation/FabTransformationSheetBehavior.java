package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.topjohnwu.magisk.R;
import java.util.HashMap;
import java.util.WeakHashMap;
import p000a.AbstractC2397t8;
import p000a.AbstractC2446u3;
import p000a.C0030Ab;
import p000a.C1168Vr;
import p000a.C1624eZ;
import p000a.C1710g8;

@Deprecated
/* loaded from: classes.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: W */
    public HashMap f9561W;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    /* renamed from: Y */
    public final C1624eZ mo5123Y(Context context, boolean z) {
        int i = z ? R.animator.mtrl_fab_transformation_sheet_expand_spec : R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        C1624eZ c1624eZ = new C1624eZ(13);
        c1624eZ.f5013R = C0030Ab.m67h(context, i);
        c1624eZ.f5015w = new C1710g8();
        return c1624eZ;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    /* renamed from: g */
    public final void mo5117g(View view, View view2, boolean z, boolean z2) {
        boolean z3;
        int i;
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                this.f9561W = new HashMap(childCount);
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                if ((childAt.getLayoutParams() instanceof C1168Vr) && (((C1168Vr) childAt.getLayoutParams()).f3818z instanceof FabTransformationScrimBehavior)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (childAt != view2 && !z3) {
                    HashMap hashMap = this.f9561W;
                    if (!z) {
                        if (hashMap != null && hashMap.containsKey(childAt)) {
                            i = ((Integer) this.f9561W.get(childAt)).intValue();
                            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                        }
                    } else {
                        hashMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        WeakHashMap weakHashMap2 = AbstractC2446u3.f7488z;
                        i = 4;
                    }
                    AbstractC2397t8.m4123g(childAt, i);
                }
            }
            if (!z) {
                this.f9561W = null;
            }
        }
        super.mo5117g(view, view2, z, z2);
    }
}
