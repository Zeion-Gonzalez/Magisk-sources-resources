package p000a;

import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* renamed from: a.DR */
/* loaded from: classes.dex */
public final class FragmentC0177DR extends Fragment {

    /* renamed from: R */
    public static final /* synthetic */ int f544R = 0;

    /* renamed from: S */
    public C0110C8 f545S;

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m347z(EnumC2241qF.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        m347z(EnumC2241qF.ON_DESTROY);
        this.f545S = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        m347z(EnumC2241qF.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        C0110C8 c0110c8 = this.f545S;
        if (c0110c8 != null) {
            c0110c8.f400z.m1355z();
        }
        m347z(EnumC2241qF.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C0110C8 c0110c8 = this.f545S;
        if (c0110c8 != null) {
            C0612LW c0612lw = c0110c8.f400z;
            int i = c0612lw.f1984S + 1;
            c0612lw.f1984S = i;
            if (i == 1 && c0612lw.f1982I) {
                c0612lw.f1986k.m721N(EnumC2241qF.ON_START);
                c0612lw.f1982I = false;
            }
        }
        m347z(EnumC2241qF.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        m347z(EnumC2241qF.ON_STOP);
    }

    /* renamed from: z */
    public final void m347z(EnumC2241qF enumC2241qF) {
        if (Build.VERSION.SDK_INT < 29) {
            C1665fK.m3142G(getActivity(), enumC2241qF);
        }
    }
}
