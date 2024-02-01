package p000a;

import android.app.Notification;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.topjohnwu.magisk.R;
import com.topjohnwu.magisk.core.download.DownloadService;
import com.topjohnwu.magisk.p001ui.flash.FlashFragment;
import com.topjohnwu.magisk.p001ui.module.ModuleFragment;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: a.yQ */
/* loaded from: classes.dex */
public final class C2670yQ extends AbstractC1021T9 implements InterfaceC2364sT {

    /* renamed from: R */
    public final /* synthetic */ int f8316R;

    /* renamed from: w */
    public final /* synthetic */ Object f8317w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2670yQ(int i, Object obj) {
        super(1);
        this.f8316R = i;
        this.f8317w = obj;
    }

    @Override // p000a.InterfaceC2364sT
    /* renamed from: W */
    public final Object mo85W(Object obj) {
        AbstractC1500cH m1203w;
        int i;
        int i2;
        Object c1019t6;
        C0329GJ c0329gj = C0329GJ.f1115z;
        int i3 = this.f8316R;
        boolean z = false;
        boolean z2 = true;
        Object obj2 = this.f8317w;
        switch (i3) {
            case AbstractC0795Op.f2698E /* 0 */:
                View view = (View) ((Map.Entry) obj).getValue();
                WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                return Boolean.valueOf(AbstractC2486us.m4287d2((Collection) obj2, AbstractC1548d9.m2997M(view)));
            case 1:
                String str = (String) obj;
                C2127o8 c2127o8 = (C2127o8) obj2;
                ArrayList arrayList = c2127o8.f6544P;
                Collection values = ((Map) c2127o8.f6551o.getValue()).values();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    AbstractC2708z8.m4637oI(((C1772hK) it.next()).f5573h, arrayList2);
                }
                return Boolean.valueOf(!AbstractC2486us.m4280M6(c2127o8.m3744h(), AbstractC2486us.m4280M6(arrayList2, arrayList)).contains(str));
            case 2:
                final C1553dE c1553dE = (C1553dE) obj;
                final C2129oA c2129oA = (C2129oA) obj2;
                return new InterfaceC1270Xo() { // from class: a.e5
                    @Override // p000a.InterfaceC1270Xo
                    /* renamed from: Q */
                    public final void mo2596Q(InterfaceC1546d7 interfaceC1546d7, EnumC2241qF enumC2241qF) {
                        EnumC2241qF enumC2241qF2 = EnumC2241qF.ON_RESUME;
                        C2129oA c2129oA2 = C2129oA.this;
                        C1553dE c1553dE2 = c1553dE;
                        if (enumC2241qF == enumC2241qF2 && ((List) c2129oA2.m4654h().f3091N.getValue()).contains(c1553dE2)) {
                            if (C0364Gx.m791p(2)) {
                                Log.v("FragmentNavigator", "Marking transition complete for entry " + c1553dE2 + " due to fragment " + interfaceC1546d7 + " view lifecycle reaching RESUMED");
                            }
                            c2129oA2.m4654h().m2057h(c1553dE2);
                        }
                        if (enumC2241qF == EnumC2241qF.ON_DESTROY) {
                            if (C0364Gx.m791p(2)) {
                                Log.v("FragmentNavigator", "Marking transition complete for entry " + c1553dE2 + " due to fragment " + interfaceC1546d7 + " view lifecycle reaching DESTROYED");
                            }
                            c2129oA2.m4654h().m2057h(c1553dE2);
                        }
                    }
                };
            case 3:
                C0084Bc c0084Bc = (C0084Bc) obj;
                if (c0084Bc != null) {
                    ((InterfaceC0559KW) obj2).mo51o(Float.valueOf(((Number) c0084Bc.f329S).floatValue()), (AbstractC0164DB) c0084Bc.f328R);
                }
                return c0329gj;
            case 4:
                m4573h((Notification.Builder) obj);
                return c0329gj;
            case 5:
                m4573h((Notification.Builder) obj);
                return c0329gj;
            case 6:
                Throwable th = (Throwable) obj;
                switch (i3) {
                    case 6:
                        ((C0730Ni) obj2).f2462w.countDown();
                        break;
                    default:
                        ((C0190Df) obj2).m374h();
                        break;
                }
                return c0329gj;
            case 7:
                if (((Boolean) obj).booleanValue()) {
                    ((InterfaceC1459bP) ((C0259Ey) obj2).f921h).mo93z();
                }
                return c0329gj;
            case 8:
                EnumC0715NT enumC0715NT = (EnumC0715NT) obj;
                FlashFragment flashFragment = (FlashFragment) obj2;
                AbstractActivityC1957kp m3511B = flashFragment.m3511B();
                if (m3511B != null && (m1203w = m3511B.m1203w()) != null) {
                    if (enumC0715NT == null) {
                        i = -1;
                    } else {
                        i = AbstractC0105C3.f395z[enumC0715NT.ordinal()];
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                i2 = R.string.failure;
                            } else {
                                throw new C0993Sd();
                            }
                        } else {
                            i2 = R.string.done;
                        }
                    } else {
                        i2 = R.string.flashing;
                    }
                    m1203w.mo2903J(i2);
                }
                if (enumC0715NT == EnumC0715NT.f2409R && flashFragment.m5136qn().f8104y) {
                    ExtendedFloatingActionButton extendedFloatingActionButton = ((AbstractC0295Fc) flashFragment.m3513K()).f1025L;
                    if (extendedFloatingActionButton.getVisibility() != 0) {
                        z2 = false;
                    }
                    if (!z2) {
                        extendedFloatingActionButton.m5053S(0);
                    }
                    if (!extendedFloatingActionButton.isFocused()) {
                        extendedFloatingActionButton.requestFocus();
                    }
                }
                return c0329gj;
            case 9:
                AbstractC1823iK abstractC1823iK = (AbstractC1823iK) obj;
                C1688fk c1688fk = (C1688fk) obj2;
                c1688fk.m4500S(new C0805P0((int) R.string.logs_cleared));
                c1688fk.m4181q();
                return c0329gj;
            case 10:
                Uri uri = (Uri) obj;
                if (uri != null) {
                    try {
                        c1019t6 = AbstractC1843ih.m3409H(uri);
                    } catch (Throwable th2) {
                        c1019t6 = new C1019T6(th2);
                    }
                    if (c1019t6 instanceof C1019T6) {
                        c1019t6 = null;
                    }
                    String str2 = (String) c1019t6;
                    if (str2 != null) {
                        ModuleFragment moduleFragment = (ModuleFragment) obj2;
                        C2744zq c2744zq = (C2744zq) moduleFragment.f9615U8.getValue();
                        c2744zq.getClass();
                        c2744zq.m4499R(new C0195Dk(c2744zq, uri, str2));
                        ((C2744zq) moduleFragment.f9615U8.getValue()).getClass();
                        C2744zq.f8599f.mo2290G(null);
                    }
                }
                return c0329gj;
            case 11:
                if (((C1608eG) obj).f4931w.f7751z == ((C1608eG) obj2).f4931w.f7751z) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 12:
                if (obj == ((AbstractC0530K) obj2)) {
                    return "(this Collection)";
                }
                return String.valueOf(obj);
            case 13:
                return AbstractC1269Xn.m2590lz((CharSequence) obj2, (C0325GF) obj);
            case 14:
                Throwable th3 = (Throwable) obj;
                switch (i3) {
                    case 6:
                        ((C0730Ni) obj2).f2462w.countDown();
                        break;
                    default:
                        ((C0190Df) obj2).m374h();
                        break;
                }
                return c0329gj;
            default:
                IOException iOException = (IOException) obj;
                byte[] bArr = AbstractC1181W6.f3860z;
                ((C0437IH) obj2).f1432E = true;
                return c0329gj;
        }
    }

    /* renamed from: h */
    public final void m4573h(Notification.Builder builder) {
        int i = this.f8316R;
        Object obj = this.f8317w;
        switch (i) {
            case 4:
                builder.setProgress(0, 0, true).setContentTitle(((DownloadService) obj).getString(R.string.hide_app_title)).setContentText("");
                return;
            default:
                builder.setContentTitle(((AbstractC0164DB) obj).mo38u());
                return;
        }
    }
}
