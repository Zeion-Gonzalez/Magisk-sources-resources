package p000a;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: a.lu */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC2015lu implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: R */
    public final ViewGroup f6257R;

    /* renamed from: S */
    public final AbstractC0614LY f6258S;

    public ViewTreeObserverOnPreDrawListenerC2015lu(ViewGroup viewGroup, AbstractC0614LY abstractC0614LY) {
        this.f6258S = abstractC0614LY;
        this.f6257R = viewGroup;
    }

    /* JADX WARN: Removed duplicated region for block: B:209:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x01ee A[EDGE_INSN: B:343:0x01ee->B:290:0x01ee BREAK  A[LOOP:1: B:214:0x0087->B:289:0x01e4], SYNTHETIC] */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onPreDraw() {
        /*
            Method dump skipped, instructions count: 709
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.ViewTreeObserverOnPreDrawListenerC2015lu.onPreDraw():boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f6257R;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        AbstractC2299rI.f7096v.remove(viewGroup);
        ArrayList arrayList = (ArrayList) AbstractC2299rI.m3955h().getOrDefault(viewGroup, null);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC0614LY) it.next()).mo1362H(viewGroup);
            }
        }
        this.f6258S.m1366M(true);
    }
}
