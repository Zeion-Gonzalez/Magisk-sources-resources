package p000a;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.topjohnwu.magisk.R;

/* renamed from: a.Ce */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0137Ce extends AbstractComponentCallbacksC2342s3 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: BX */
    public boolean f461BX;

    /* renamed from: G5 */
    public Dialog f463G5;

    /* renamed from: Pm */
    public boolean f467Pm;

    /* renamed from: d2 */
    public boolean f470d2;

    /* renamed from: dG */
    public boolean f471dG;

    /* renamed from: n0 */
    public Handler f474n0;

    /* renamed from: EC */
    public final RunnableC1927kG f462EC = new RunnableC1927kG(0, this);

    /* renamed from: U8 */
    public final DialogInterfaceOnCancelListenerC1918k4 f468U8 = new DialogInterfaceOnCancelListenerC1918k4(this);

    /* renamed from: BO */
    public final DialogInterfaceOnDismissListenerC0719NX f460BO = new DialogInterfaceOnDismissListenerC0719NX(this);

    /* renamed from: he */
    public int f473he = 0;

    /* renamed from: dx */
    public int f472dx = 0;

    /* renamed from: ZH */
    public boolean f469ZH = true;

    /* renamed from: Lq */
    public boolean f465Lq = true;

    /* renamed from: Ha */
    public int f464Ha = -1;

    /* renamed from: oI */
    public final C2509vE f475oI = new C2509vE(this);

    /* renamed from: O4 */
    public boolean f466O4 = false;

    /* renamed from: B */
    public final void m277B(boolean z, boolean z2) {
        if (this.f470d2) {
            return;
        }
        this.f470d2 = true;
        this.f471dG = false;
        Dialog dialog = this.f463G5;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f463G5.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.f474n0.getLooper()) {
                    onDismiss(this.f463G5);
                } else {
                    this.f474n0.post(this.f462EC);
                }
            }
        }
        this.f461BX = true;
        if (this.f464Ha >= 0) {
            C0364Gx m4005R = m4005R();
            int i = this.f464Ha;
            if (i >= 0) {
                m4005R.m812U(new C2646xu(m4005R, null, i), z);
                this.f464Ha = -1;
                return;
            }
            throw new IllegalArgumentException(AbstractC2441tz.m4188N("Bad id: ", i));
        }
        C0398HY c0398hy = new C0398HY(m4005R());
        c0398hy.f1329I = true;
        C0364Gx c0364Gx = this.f7198X;
        if (c0364Gx != null && c0364Gx != c0398hy.f1342q) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        c0398hy.m894h(new C0547KI(3, this));
        if (z) {
            c0398hy.m892P(true);
        } else {
            c0398hy.m892P(false);
        }
    }

    /* renamed from: D */
    public final Dialog m278D() {
        Dialog dialog = this.f463G5;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    @Override // p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: F */
    public void mo279F(Bundle bundle) {
        Dialog dialog = this.f463G5;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.f473he;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f472dx;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f469ZH;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f465Lq;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f464Ha;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0046 A[Catch: all -> 0x006b, TryCatch #0 {all -> 0x006b, blocks: (B:62:0x001a, B:64:0x0026, B:74:0x003e, B:76:0x0046, B:77:0x004d, B:70:0x0030, B:72:0x0036, B:73:0x003b, B:78:0x0065), top: B:98:0x001a }] */
    @Override // p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.LayoutInflater mo280H(android.os.Bundle r8) {
        /*
            r7 = this;
            android.view.LayoutInflater r8 = super.mo280H(r8)
            boolean r0 = r7.f465Lq
            java.lang.String r1 = "FragmentManager"
            r2 = 2
            if (r0 == 0) goto L98
            boolean r3 = r7.f467Pm
            if (r3 == 0) goto L11
            goto L98
        L11:
            if (r0 != 0) goto L14
            goto L6f
        L14:
            boolean r0 = r7.f466O4
            if (r0 != 0) goto L6f
            r0 = 0
            r3 = 1
            r7.f467Pm = r3     // Catch: java.lang.Throwable -> L6b
            android.app.Dialog r4 = r7.mo282K()     // Catch: java.lang.Throwable -> L6b
            r7.f463G5 = r4     // Catch: java.lang.Throwable -> L6b
            boolean r5 = r7.f465Lq     // Catch: java.lang.Throwable -> L6b
            if (r5 == 0) goto L65
            int r5 = r7.f473he     // Catch: java.lang.Throwable -> L6b
            if (r5 == r3) goto L3b
            if (r5 == r2) goto L3b
            r6 = 3
            if (r5 == r6) goto L30
            goto L3e
        L30:
            android.view.Window r5 = r4.getWindow()     // Catch: java.lang.Throwable -> L6b
            if (r5 == 0) goto L3b
            r6 = 24
            r5.addFlags(r6)     // Catch: java.lang.Throwable -> L6b
        L3b:
            r4.requestWindowFeature(r3)     // Catch: java.lang.Throwable -> L6b
        L3e:
            android.content.Context r4 = r7.m4003M()     // Catch: java.lang.Throwable -> L6b
            boolean r5 = r4 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L6b
            if (r5 == 0) goto L4d
            android.app.Dialog r5 = r7.f463G5     // Catch: java.lang.Throwable -> L6b
            android.app.Activity r4 = (android.app.Activity) r4     // Catch: java.lang.Throwable -> L6b
            r5.setOwnerActivity(r4)     // Catch: java.lang.Throwable -> L6b
        L4d:
            android.app.Dialog r4 = r7.f463G5     // Catch: java.lang.Throwable -> L6b
            boolean r5 = r7.f469ZH     // Catch: java.lang.Throwable -> L6b
            r4.setCancelable(r5)     // Catch: java.lang.Throwable -> L6b
            android.app.Dialog r4 = r7.f463G5     // Catch: java.lang.Throwable -> L6b
            a.k4 r5 = r7.f468U8     // Catch: java.lang.Throwable -> L6b
            r4.setOnCancelListener(r5)     // Catch: java.lang.Throwable -> L6b
            android.app.Dialog r4 = r7.f463G5     // Catch: java.lang.Throwable -> L6b
            a.NX r5 = r7.f460BO     // Catch: java.lang.Throwable -> L6b
            r4.setOnDismissListener(r5)     // Catch: java.lang.Throwable -> L6b
            r7.f466O4 = r3     // Catch: java.lang.Throwable -> L6b
            goto L68
        L65:
            r3 = 0
            r7.f463G5 = r3     // Catch: java.lang.Throwable -> L6b
        L68:
            r7.f467Pm = r0
            goto L6f
        L6b:
            r8 = move-exception
            r7.f467Pm = r0
            throw r8
        L6f:
            boolean r0 = p000a.C0364Gx.m791p(r2)
            if (r0 == 0) goto L8b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "get layout inflater for DialogFragment "
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r2 = " from dialog context"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L8b:
            android.app.Dialog r0 = r7.f463G5
            if (r0 == 0) goto L97
            android.content.Context r0 = r0.getContext()
            android.view.LayoutInflater r8 = r8.cloneInContext(r0)
        L97:
            return r8
        L98:
            boolean r0 = p000a.C0364Gx.m791p(r2)
            if (r0 == 0) goto Lc9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "getting layout inflater for DialogFragment "
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            boolean r2 = r7.f465Lq
            if (r2 != 0) goto Lb8
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "mShowsDialog = false: "
            r2.<init>(r3)
            goto Lbf
        Lb8:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "mCreatingDialog = true: "
            r2.<init>(r3)
        Lbf:
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.d(r1, r0)
        Lc9:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.DialogInterfaceOnCancelListenerC0137Ce.mo280H(android.os.Bundle):android.view.LayoutInflater");
    }

    @Override // p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: J */
    public final void mo281J() {
        this.f7224x = true;
        Dialog dialog = this.f463G5;
        if (dialog != null) {
            this.f461BX = true;
            dialog.setOnDismissListener(null);
            this.f463G5.dismiss();
            if (!this.f470d2) {
                onDismiss(this.f463G5);
            }
            this.f463G5 = null;
            this.f466O4 = false;
        }
    }

    /* renamed from: K */
    public Dialog mo282K() {
        if (C0364Gx.m791p(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new DialogC2096nV(m4004O(), this.f472dx);
    }

    @Override // p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: L */
    public final void mo283L(Bundle bundle) {
        Bundle bundle2;
        this.f7224x = true;
        if (this.f463G5 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f463G5.onRestoreInstanceState(bundle2);
        }
    }

    @Override // p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: U */
    public final void mo284U() {
        this.f7224x = true;
    }

    @Override // p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: Z */
    public void mo285Z() {
        this.f7224x = true;
        Dialog dialog = this.f463G5;
        if (dialog != null) {
            this.f461BX = false;
            dialog.show();
            View decorView = this.f463G5.getWindow().getDecorView();
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: c */
    public final void mo286c() {
        this.f7224x = true;
        if (!this.f471dG && !this.f470d2) {
            this.f470d2 = true;
        }
        this.f7188HL.m4846W(this.f475oI);
    }

    @Override // p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: f */
    public final void mo287f(Context context) {
        super.mo287f(context);
        this.f7188HL.m4845Q(this.f475oI);
        if (this.f471dG) {
            return;
        }
        this.f470d2 = false;
    }

    @Override // p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: i */
    public final void mo288i(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.mo288i(layoutInflater, viewGroup, bundle);
        if (this.f7222t != null || this.f463G5 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f463G5.onRestoreInstanceState(bundle2);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f461BX) {
            return;
        }
        if (C0364Gx.m791p(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        m277B(true, true);
    }

    @Override // p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: p */
    public void mo289p() {
        this.f7224x = true;
        Dialog dialog = this.f463G5;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: r */
    public void mo290r(Bundle bundle) {
        super.mo290r(bundle);
        this.f474n0 = new Handler();
        this.f465Lq = this.f7209j == 0;
        if (bundle != null) {
            this.f473he = bundle.getInt("android:style", 0);
            this.f472dx = bundle.getInt("android:theme", 0);
            this.f469ZH = bundle.getBoolean("android:cancelable", true);
            this.f465Lq = bundle.getBoolean("android:showsDialog", this.f465Lq);
            this.f464Ha = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: u */
    public final AbstractC2703z2 mo291u() {
        return new C2197pO(this, new C0973SG(this));
    }
}
