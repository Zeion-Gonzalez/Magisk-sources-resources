package p000a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.topjohnwu.magisk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: a.Dw */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0205Dw extends AbstractC1153Va implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: E */
    public final ViewOnAttachStateChangeListenerC0173DN f623E;

    /* renamed from: F */
    public int f624F;

    /* renamed from: H */
    public int f625H;

    /* renamed from: I */
    public final int f626I;

    /* renamed from: J */
    public View f627J;

    /* renamed from: L */
    public ViewTreeObserver f628L;

    /* renamed from: R */
    public final Context f629R;

    /* renamed from: U */
    public final ViewTreeObserverOnGlobalLayoutListenerC0520Jn f630U;

    /* renamed from: X */
    public boolean f631X;

    /* renamed from: Z */
    public int f633Z;

    /* renamed from: c */
    public View f634c;

    /* renamed from: d */
    public boolean f635d;

    /* renamed from: e */
    public boolean f636e;

    /* renamed from: g */
    public final Handler f638g;

    /* renamed from: i */
    public PopupWindow.OnDismissListener f639i;

    /* renamed from: j */
    public InterfaceC0656MP f640j;

    /* renamed from: k */
    public final boolean f641k;

    /* renamed from: p */
    public boolean f642p;

    /* renamed from: q */
    public final int f643q;

    /* renamed from: w */
    public final int f646w;

    /* renamed from: y */
    public final ArrayList f647y = new ArrayList();

    /* renamed from: s */
    public final ArrayList f645s = new ArrayList();

    /* renamed from: f */
    public final C2196pM f637f = new C2196pM(3, this);

    /* renamed from: r */
    public int f644r = 0;

    /* renamed from: Y */
    public int f632Y = 0;

    /* renamed from: C */
    public boolean f622C = false;

    public ViewOnKeyListenerC0205Dw(Context context, View view, int i, int i2, boolean z) {
        this.f630U = new ViewTreeObserverOnGlobalLayoutListenerC0520Jn(this, r1);
        this.f623E = new ViewOnAttachStateChangeListenerC0173DN(r1, this);
        this.f629R = context;
        this.f627J = view;
        this.f626I = i;
        this.f643q = i2;
        this.f641k = z;
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        this.f625H = AbstractC0095Bq.m199P(view) != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f646w = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f638g = new Handler();
    }

    @Override // p000a.AbstractC1153Va
    /* renamed from: E */
    public final void mo394E(int i) {
        this.f631X = true;
        this.f633Z = i;
    }

    @Override // p000a.InterfaceC2298rH
    /* renamed from: M */
    public final C2409tO mo395M() {
        ArrayList arrayList = this.f645s;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0041Ar) arrayList.get(arrayList.size() - 1)).f185z.f2145w;
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: N */
    public final boolean mo218N() {
        return false;
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: P */
    public final boolean mo219P(SubMenuC1188WE subMenuC1188WE) {
        Iterator it = this.f645s.iterator();
        while (it.hasNext()) {
            C0041Ar c0041Ar = (C0041Ar) it.next();
            if (subMenuC1188WE == c0041Ar.f183h) {
                c0041Ar.f185z.f2145w.requestFocus();
                return true;
            }
        }
        if (subMenuC1188WE.hasVisibleItems()) {
            mo404w(subMenuC1188WE);
            InterfaceC0656MP interfaceC0656MP = this.f640j;
            if (interfaceC0656MP != null) {
                interfaceC0656MP.mo1242v(subMenuC1188WE);
            }
            return true;
        }
        return false;
    }

    @Override // p000a.InterfaceC2298rH
    /* renamed from: Q */
    public final void mo396Q() {
        if (mo399h()) {
            return;
        }
        ArrayList arrayList = this.f647y;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m402r((C2189pE) it.next());
        }
        arrayList.clear();
        View view = this.f627J;
        this.f634c = view;
        if (view != null) {
            boolean z = this.f628L == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f628L = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f630U);
            }
            this.f634c.addOnAttachStateChangeListener(this.f623E);
        }
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: S */
    public final void mo221S(boolean z) {
        Iterator it = this.f645s.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0041Ar) it.next()).f185z.f2145w.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C2476uh) adapter).notifyDataSetChanged();
        }
    }

    @Override // p000a.AbstractC1153Va
    /* renamed from: U */
    public final void mo397U(boolean z) {
        this.f642p = z;
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: W */
    public final void mo223W(InterfaceC0656MP interfaceC0656MP) {
        this.f640j = interfaceC0656MP;
    }

    @Override // p000a.InterfaceC2298rH
    public final void dismiss() {
        ArrayList arrayList = this.f645s;
        int size = arrayList.size();
        if (size <= 0) {
            return;
        }
        C0041Ar[] c0041ArArr = (C0041Ar[]) arrayList.toArray(new C0041Ar[size]);
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C0041Ar c0041Ar = c0041ArArr[size];
            if (c0041Ar.f185z.mo399h()) {
                c0041Ar.f185z.dismiss();
            }
        }
    }

    @Override // p000a.AbstractC1153Va
    /* renamed from: g */
    public final void mo398g(int i) {
        if (this.f644r != i) {
            this.f644r = i;
            View view = this.f627J;
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            this.f632Y = Gravity.getAbsoluteGravity(i, AbstractC0095Bq.m199P(view));
        }
    }

    @Override // p000a.InterfaceC2298rH
    /* renamed from: h */
    public final boolean mo399h() {
        ArrayList arrayList = this.f645s;
        return arrayList.size() > 0 && ((C0041Ar) arrayList.get(0)).f185z.mo399h();
    }

    @Override // p000a.AbstractC1153Va
    /* renamed from: k */
    public final void mo400k(boolean z) {
        this.f622C = z;
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: o */
    public final void mo224o(Parcelable parcelable) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0041Ar c0041Ar;
        ArrayList arrayList = this.f645s;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c0041Ar = null;
                break;
            }
            c0041Ar = (C0041Ar) arrayList.get(i);
            if (!c0041Ar.f185z.mo399h()) {
                break;
            } else {
                i++;
            }
        }
        if (c0041Ar != null) {
            c0041Ar.f183h.m3804v(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p000a.AbstractC1153Va
    /* renamed from: q */
    public final void mo401q(View view) {
        if (this.f627J != view) {
            this.f627J = view;
            int i = this.f644r;
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            this.f632Y = Gravity.getAbsoluteGravity(i, AbstractC0095Bq.m199P(view));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x01a1  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m402r(p000a.C2189pE r19) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.ViewOnKeyListenerC0205Dw.m402r(a.pE):void");
    }

    @Override // p000a.AbstractC1153Va
    /* renamed from: s */
    public final void mo403s(PopupWindow.OnDismissListener onDismissListener) {
        this.f639i = onDismissListener;
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: u */
    public final Parcelable mo225u() {
        return null;
    }

    @Override // p000a.AbstractC1153Va
    /* renamed from: w */
    public final void mo404w(C2189pE c2189pE) {
        c2189pE.m3798h(this, this.f629R);
        if (mo399h()) {
            m402r(c2189pE);
        } else {
            this.f647y.add(c2189pE);
        }
    }

    @Override // p000a.AbstractC1153Va
    /* renamed from: y */
    public final void mo405y(int i) {
        this.f636e = true;
        this.f624F = i;
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: z */
    public final void mo227z(C2189pE c2189pE, boolean z) {
        int i;
        ArrayList arrayList = this.f645s;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                if (c2189pE == ((C0041Ar) arrayList.get(i2)).f183h) {
                    break;
                } else {
                    i2++;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 < 0) {
            return;
        }
        int i3 = i2 + 1;
        if (i3 < arrayList.size()) {
            ((C0041Ar) arrayList.get(i3)).f183h.m3804v(false);
        }
        C0041Ar c0041Ar = (C0041Ar) arrayList.remove(i2);
        c0041Ar.f183h.m3799k(this);
        boolean z2 = this.f635d;
        C0692N5 c0692n5 = c0041Ar.f185z;
        if (z2) {
            AbstractC1220Wn.m2517h(c0692n5.f2138i, null);
            c0692n5.f2138i.setAnimationStyle(0);
        }
        c0692n5.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            i = ((C0041Ar) arrayList.get(size2 - 1)).f184v;
        } else {
            View view = this.f627J;
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            if (AbstractC0095Bq.m199P(view) == 1) {
                i = 0;
            } else {
                i = 1;
            }
        }
        this.f625H = i;
        if (size2 == 0) {
            dismiss();
            InterfaceC0656MP interfaceC0656MP = this.f640j;
            if (interfaceC0656MP != null) {
                interfaceC0656MP.mo1243z(c2189pE, true);
            }
            ViewTreeObserver viewTreeObserver = this.f628L;
            if (viewTreeObserver != null) {
                if (viewTreeObserver.isAlive()) {
                    this.f628L.removeGlobalOnLayoutListener(this.f630U);
                }
                this.f628L = null;
            }
            this.f634c.removeOnAttachStateChangeListener(this.f623E);
            this.f639i.onDismiss();
            return;
        }
        if (z) {
            ((C0041Ar) arrayList.get(0)).f183h.m3804v(false);
        }
    }
}
