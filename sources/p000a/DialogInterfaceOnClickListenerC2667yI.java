package p000a;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* renamed from: a.yI */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC2667yI implements InterfaceC1037TS, DialogInterface.OnClickListener {

    /* renamed from: I */
    public final /* synthetic */ C2184p9 f8309I;

    /* renamed from: R */
    public ListAdapter f8310R;

    /* renamed from: S */
    public DialogInterfaceC0723Nb f8311S;

    /* renamed from: w */
    public CharSequence f8312w;

    public DialogInterfaceOnClickListenerC2667yI(C2184p9 c2184p9) {
        this.f8309I = c2184p9;
    }

    @Override // p000a.InterfaceC1037TS
    /* renamed from: G */
    public final CharSequence mo2204G() {
        return this.f8312w;
    }

    @Override // p000a.InterfaceC1037TS
    /* renamed from: I */
    public final void mo1462I(ListAdapter listAdapter) {
        this.f8310R = listAdapter;
    }

    @Override // p000a.InterfaceC1037TS
    /* renamed from: N */
    public final void mo2205N(int i, int i2) {
        if (this.f8310R == null) {
            return;
        }
        C2184p9 c2184p9 = this.f8309I;
        C0073BQ c0073bq = new C0073BQ(c2184p9.f6685R);
        CharSequence charSequence = this.f8312w;
        Object obj = c0073bq.f309R;
        if (charSequence != null) {
            ((C1319Yj) obj).f4183P = charSequence;
        }
        ListAdapter listAdapter = this.f8310R;
        int selectedItemPosition = c2184p9.getSelectedItemPosition();
        C1319Yj c1319Yj = (C1319Yj) obj;
        c1319Yj.f4188u = listAdapter;
        c1319Yj.f4187o = this;
        c1319Yj.f4181G = selectedItemPosition;
        c1319Yj.f4185W = true;
        DialogInterfaceC0723Nb m157z = c0073bq.m157z();
        this.f8311S = m157z;
        AlertController$RecycleListView alertController$RecycleListView = m157z.f2427k.f2660N;
        AbstractC1263Xf.m2563P(alertController$RecycleListView, i);
        AbstractC1263Xf.m2565v(alertController$RecycleListView, i2);
        this.f8311S.show();
    }

    @Override // p000a.InterfaceC1037TS
    /* renamed from: P */
    public final int mo2206P() {
        return 0;
    }

    @Override // p000a.InterfaceC1037TS
    /* renamed from: R */
    public final void mo2207R(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // p000a.InterfaceC1037TS
    /* renamed from: S */
    public final void mo2208S(CharSequence charSequence) {
        this.f8312w = charSequence;
    }

    @Override // p000a.InterfaceC1037TS
    /* renamed from: W */
    public final Drawable mo2209W() {
        return null;
    }

    @Override // p000a.InterfaceC1037TS
    public final void dismiss() {
        DialogInterfaceC0723Nb dialogInterfaceC0723Nb = this.f8311S;
        if (dialogInterfaceC0723Nb != null) {
            dialogInterfaceC0723Nb.dismiss();
            this.f8311S = null;
        }
    }

    @Override // p000a.InterfaceC1037TS
    /* renamed from: h */
    public final boolean mo2210h() {
        DialogInterfaceC0723Nb dialogInterfaceC0723Nb = this.f8311S;
        if (dialogInterfaceC0723Nb != null) {
            return dialogInterfaceC0723Nb.isShowing();
        }
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C2184p9 c2184p9 = this.f8309I;
        c2184p9.setSelection(i);
        if (c2184p9.getOnItemClickListener() != null) {
            c2184p9.performItemClick(null, i, this.f8310R.getItemId(i));
        }
        dismiss();
    }

    @Override // p000a.InterfaceC1037TS
    /* renamed from: q */
    public final void mo2211q(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // p000a.InterfaceC1037TS
    /* renamed from: u */
    public final int mo2212u() {
        return 0;
    }

    @Override // p000a.InterfaceC1037TS
    /* renamed from: v */
    public final void mo2213v(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // p000a.InterfaceC1037TS
    /* renamed from: w */
    public final void mo2214w(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }
}
