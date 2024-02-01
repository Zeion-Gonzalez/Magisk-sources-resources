package p000a;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* renamed from: a.C2 */
/* loaded from: classes.dex */
public final class C0104C2 implements InterfaceC2687yj, AdapterView.OnItemClickListener {

    /* renamed from: I */
    public ExpandedMenuView f389I;

    /* renamed from: R */
    public LayoutInflater f390R;

    /* renamed from: S */
    public Context f391S;

    /* renamed from: k */
    public C1533cv f392k;

    /* renamed from: q */
    public InterfaceC0656MP f393q;

    /* renamed from: w */
    public C2189pE f394w;

    public C0104C2(Context context) {
        this.f391S = context;
        this.f390R = LayoutInflater.from(context);
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: G */
    public final void mo217G(Context context, C2189pE c2189pE) {
        if (this.f391S != null) {
            this.f391S = context;
            if (this.f390R == null) {
                this.f390R = LayoutInflater.from(context);
            }
        }
        this.f394w = c2189pE;
        C1533cv c1533cv = this.f392k;
        if (c1533cv != null) {
            c1533cv.notifyDataSetChanged();
        }
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: N */
    public final boolean mo218N() {
        return false;
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: P */
    public final boolean mo219P(SubMenuC1188WE subMenuC1188WE) {
        if (!subMenuC1188WE.hasVisibleItems()) {
            return false;
        }
        DialogInterfaceOnKeyListenerC2366sW dialogInterfaceOnKeyListenerC2366sW = new DialogInterfaceOnKeyListenerC2366sW(subMenuC1188WE);
        Context context = subMenuC1188WE.f6724z;
        C0073BQ c0073bq = new C0073BQ(context);
        Object obj = c0073bq.f309R;
        C1319Yj c1319Yj = (C1319Yj) obj;
        C0104C2 c0104c2 = new C0104C2(c1319Yj.f4190z);
        dialogInterfaceOnKeyListenerC2366sW.f7269w = c0104c2;
        c0104c2.f393q = dialogInterfaceOnKeyListenerC2366sW;
        subMenuC1188WE.m3798h(c0104c2, context);
        C0104C2 c0104c22 = dialogInterfaceOnKeyListenerC2366sW.f7269w;
        if (c0104c22.f392k == null) {
            c0104c22.f392k = new C1533cv(c0104c22);
        }
        c1319Yj.f4188u = c0104c22.f392k;
        c1319Yj.f4187o = dialogInterfaceOnKeyListenerC2366sW;
        View view = subMenuC1188WE.f6722w;
        if (view != null) {
            c1319Yj.f4182N = view;
        } else {
            c1319Yj.f4189v = subMenuC1188WE.f6708R;
            ((C1319Yj) obj).f4183P = subMenuC1188WE.f6709S;
        }
        c1319Yj.f4184Q = dialogInterfaceOnKeyListenerC2366sW;
        DialogInterfaceC0723Nb m157z = c0073bq.m157z();
        dialogInterfaceOnKeyListenerC2366sW.f7267R = m157z;
        m157z.setOnDismissListener(dialogInterfaceOnKeyListenerC2366sW);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC2366sW.f7267R.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC2366sW.f7267R.show();
        InterfaceC0656MP interfaceC0656MP = this.f393q;
        if (interfaceC0656MP != null) {
            interfaceC0656MP.mo1242v(subMenuC1188WE);
            return true;
        }
        return true;
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: R */
    public final boolean mo220R(C1117Uu c1117Uu) {
        return false;
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: S */
    public final void mo221S(boolean z) {
        C1533cv c1533cv = this.f392k;
        if (c1533cv != null) {
            c1533cv.notifyDataSetChanged();
        }
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: V */
    public final boolean mo222V(C1117Uu c1117Uu) {
        return false;
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: W */
    public final void mo223W(InterfaceC0656MP interfaceC0656MP) {
        this.f393q = interfaceC0656MP;
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: o */
    public final void mo224o(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f389I.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f394w.m3801q(this.f392k.getItem(i), this, 0);
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: u */
    public final Parcelable mo225u() {
        if (this.f389I == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f389I;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: v */
    public final int mo226v() {
        return 0;
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: z */
    public final void mo227z(C2189pE c2189pE, boolean z) {
        InterfaceC0656MP interfaceC0656MP = this.f393q;
        if (interfaceC0656MP != null) {
            interfaceC0656MP.mo1243z(c2189pE, z);
        }
    }
}
