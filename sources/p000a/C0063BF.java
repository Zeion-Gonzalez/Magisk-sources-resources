package p000a;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.WeakHashMap;

/* renamed from: a.BF */
/* loaded from: classes.dex */
public final class C0063BF extends C0042As {

    /* renamed from: h */
    public final /* synthetic */ C2596wu f257h;

    public C0063BF(C2596wu c2596wu) {
        this.f257h = c2596wu;
    }

    @Override // p000a.C0042As
    /* renamed from: h */
    public final C1799hs mo87h(int i) {
        C2596wu c2596wu = this.f257h;
        int i2 = i == 2 ? c2596wu.f7979M : c2596wu.f7984V;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return mo89z(i2);
    }

    @Override // p000a.C0042As
    /* renamed from: v */
    public final boolean mo88v(int i, int i2, Bundle bundle) {
        int i3;
        C2596wu c2596wu = this.f257h;
        View view = c2596wu.f7985W;
        if (i != -1) {
            boolean z = true;
            if (i2 != 1) {
                Chip chip = c2596wu.f7983S;
                if (i2 != 2) {
                    if (i2 != 64) {
                        if (i2 != 128) {
                            if (i2 != 16) {
                                return false;
                            }
                            if (i == 0) {
                                return chip.performClick();
                            }
                            if (i != 1) {
                                return false;
                            }
                            chip.playSoundEffect(0);
                            return false;
                        }
                        if (c2596wu.f7979M == i) {
                            c2596wu.f7979M = Integer.MIN_VALUE;
                            view.invalidate();
                            c2596wu.m4473R(i, 65536);
                        }
                        z = false;
                    } else {
                        AccessibilityManager accessibilityManager = c2596wu.f7986o;
                        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i3 = c2596wu.f7979M) != i) {
                            if (i3 != Integer.MIN_VALUE) {
                                c2596wu.f7979M = Integer.MIN_VALUE;
                                c2596wu.f7985W.invalidate();
                                c2596wu.m4473R(i3, 65536);
                            }
                            c2596wu.f7979M = i;
                            view.invalidate();
                            c2596wu.m4473R(i, 32768);
                        }
                        z = false;
                    }
                } else {
                    if (c2596wu.f7984V == i) {
                        c2596wu.f7984V = Integer.MIN_VALUE;
                        if (i == 1) {
                            chip.f9327f = false;
                            chip.refreshDrawableState();
                        }
                        c2596wu.m4473R(i, 8);
                    }
                    z = false;
                }
                return z;
            }
            return c2596wu.m4474S(i);
        }
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        return AbstractC2397t8.m4113G(view, i2, bundle);
    }

    @Override // p000a.C0042As
    /* renamed from: z */
    public final C1799hs mo89z(int i) {
        return new C1799hs(AccessibilityNodeInfo.obtain(this.f257h.m4472M(i).f5654z));
    }
}
