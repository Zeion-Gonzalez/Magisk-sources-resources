package p000a;

import android.app.Notification;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import com.topjohnwu.magisk.R;
import java.lang.ref.WeakReference;
import java.util.zip.ZipEntry;

/* renamed from: a.lF */
/* loaded from: classes.dex */
public final class C1980lF extends AbstractC1021T9 implements InterfaceC2364sT {

    /* renamed from: R */
    public final /* synthetic */ int f6145R;

    /* renamed from: w */
    public static final C1980lF f6143w = new C1980lF(0);

    /* renamed from: I */
    public static final C1980lF f6125I = new C1980lF(1);

    /* renamed from: q */
    public static final C1980lF f6140q = new C1980lF(2);

    /* renamed from: k */
    public static final C1980lF f6138k = new C1980lF(3);

    /* renamed from: g */
    public static final C1980lF f6135g = new C1980lF(4);

    /* renamed from: y */
    public static final C1980lF f6144y = new C1980lF(5);

    /* renamed from: s */
    public static final C1980lF f6142s = new C1980lF(6);

    /* renamed from: U */
    public static final C1980lF f6128U = new C1980lF(7);

    /* renamed from: E */
    public static final C1980lF f6122E = new C1980lF(8);

    /* renamed from: f */
    public static final C1980lF f6134f = new C1980lF(9);

    /* renamed from: r */
    public static final C1980lF f6141r = new C1980lF(10);

    /* renamed from: Y */
    public static final C1980lF f6130Y = new C1980lF(11);

    /* renamed from: J */
    public static final C1980lF f6126J = new C1980lF(12);

    /* renamed from: c */
    public static final C1980lF f6132c = new C1980lF(13);

    /* renamed from: H */
    public static final C1980lF f6124H = new C1980lF(14);

    /* renamed from: e */
    public static final C1980lF f6133e = new C1980lF(15);

    /* renamed from: X */
    public static final C1980lF f6129X = new C1980lF(22);

    /* renamed from: F */
    public static final C1980lF f6123F = new C1980lF(23);

    /* renamed from: Z */
    public static final C1980lF f6131Z = new C1980lF(24);

    /* renamed from: C */
    public static final C1980lF f6121C = new C1980lF(25);

    /* renamed from: p */
    public static final C1980lF f6139p = new C1980lF(26);

    /* renamed from: j */
    public static final C1980lF f6137j = new C1980lF(27);

    /* renamed from: L */
    public static final C1980lF f6127L = new C1980lF(28);

    /* renamed from: i */
    public static final C1980lF f6136i = new C1980lF(29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1980lF(int i) {
        super(1);
        this.f6145R = i;
    }

    /* renamed from: N */
    public final View m3590N(View view) {
        switch (this.f6145R) {
            case 1:
                ViewParent parent = view.getParent();
                if (!(parent instanceof View)) {
                    return null;
                }
                return (View) parent;
            default:
                ViewParent parent2 = view.getParent();
                if (!(parent2 instanceof View)) {
                    return null;
                }
                return (View) parent2;
        }
    }

    @Override // p000a.InterfaceC2364sT
    /* renamed from: W */
    public final Object mo85W(Object obj) {
        C0329GJ c0329gj = C0329GJ.f1115z;
        int i = this.f6145R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                AbstractC2180p4 abstractC2180p4 = (AbstractC2180p4) obj;
                return new C1483bu();
            case 1:
                return m3590N((View) obj);
            case 2:
                Object tag = ((View) obj).getTag(R.id.view_tree_lifecycle_owner);
                if (!(tag instanceof InterfaceC1546d7)) {
                    return null;
                }
                return (InterfaceC1546d7) tag;
            case 3:
                return m3593v((Context) obj);
            case 4:
                return m3593v((Context) obj);
            case 5:
                C0893Qo c0893Qo = (C0893Qo) obj;
                switch (i) {
                    case 5:
                        c0893Qo.f3066v = true;
                        break;
                    default:
                        c0893Qo.f3065h = true;
                        break;
                }
                return c0329gj;
            case 6:
                return m3591h((C1420ag) obj);
            case 7:
                return m3591h((C1420ag) obj);
            case 8:
                C2488uu c2488uu = (C2488uu) obj;
                c2488uu.f7620z = 0;
                c2488uu.f7619h = 0;
                return c0329gj;
            case 9:
                ((C0058BA) obj).f242z = true;
                return c0329gj;
            case 10:
                return m3591h((C1420ag) obj);
            case 11:
                return m3591h((C1420ag) obj);
            case 12:
                return m3590N((View) obj);
            case 13:
                Object tag2 = ((View) obj).getTag(R.id.nav_controller_view_tag);
                if (tag2 instanceof WeakReference) {
                    tag2 = ((WeakReference) tag2).get();
                } else if (!(tag2 instanceof AbstractC2499v4)) {
                    return null;
                }
                return (AbstractC2499v4) tag2;
            case 14:
                C0893Qo c0893Qo2 = (C0893Qo) obj;
                switch (i) {
                    case 5:
                        c0893Qo2.f3066v = true;
                        break;
                    default:
                        c0893Qo2.f3065h = true;
                        break;
                }
                return c0329gj;
            case 15:
                AbstractC2180p4 abstractC2180p42 = (AbstractC2180p4) obj;
                return new C0950Rr();
            case 16:
                return ((InterfaceC1136VG) obj).mo1949w();
            case 17:
                return Boolean.valueOf(((InterfaceC1136VG) obj).mo1945k());
            case 18:
                return ((InterfaceC1136VG) obj).mo1947od();
            case 19:
                InterfaceC1136VG interfaceC1136VG = (InterfaceC1136VG) obj;
                return null;
            case 20:
                return Long.valueOf(((InterfaceC2721zM) obj).mo4349nP());
            case 21:
                return Integer.valueOf(((InterfaceC2721zM) obj).mo4350p());
            case 22:
                if (obj instanceof Boolean) {
                    if (((Boolean) obj).booleanValue()) {
                        return "1";
                    }
                    return "0";
                }
                if (obj instanceof Number) {
                    return obj.toString();
                }
                return "\"" + obj + "\"";
            case 23:
                Notification.Builder builder = (Notification.Builder) obj;
                return c0329gj;
            case 24:
                ZipEntry zipEntry = (ZipEntry) obj;
                return Boolean.FALSE;
            case 25:
                m3592u((C0738Nr) obj);
                return c0329gj;
            case 26:
                m3592u((C0738Nr) obj);
                return c0329gj;
            case 27:
                m3592u((C0738Nr) obj);
                return c0329gj;
            case 28:
                m3592u((C0738Nr) obj);
                return c0329gj;
            default:
                m3592u((C0738Nr) obj);
                return c0329gj;
        }
    }

    /* renamed from: h */
    public final C1420ag m3591h(C1420ag c1420ag) {
        boolean z = false;
        switch (this.f6145R) {
            case 6:
                C1951kj c1951kj = c1420ag.f4448R;
                if (c1951kj != null && c1951kj.f6046f == c1420ag.f4455y) {
                    z = true;
                }
                if (!z) {
                    return null;
                }
                return c1951kj;
            case 7:
                C1951kj c1951kj2 = c1420ag.f4448R;
                if (c1951kj2 != null && c1951kj2.f6046f == c1420ag.f4455y) {
                    z = true;
                }
                if (!z) {
                    return null;
                }
                return c1951kj2;
            case 8:
            case 9:
            default:
                if (!(c1420ag instanceof C1951kj)) {
                    return null;
                }
                C1951kj c1951kj3 = (C1951kj) c1420ag;
                return c1951kj3.m3572V(c1951kj3.f6046f, true);
            case 10:
                return c1420ag.f4448R;
        }
    }

    /* renamed from: u */
    public final void m3592u(C0738Nr c0738Nr) {
        switch (this.f6145R) {
            case 25:
                c0738Nr.m1710W(17039360);
                return;
            case 26:
                c0738Nr.m1710W(17039360);
                return;
            case 27:
                c0738Nr.m1710W(17039360);
                return;
            case 28:
                c0738Nr.m1710W(17039360);
                return;
            default:
                c0738Nr.m1710W(17039370);
                return;
        }
    }

    /* renamed from: v */
    public final Context m3593v(Context context) {
        switch (this.f6145R) {
            case 3:
                if (!(context instanceof ContextWrapper)) {
                    return null;
                }
                return ((ContextWrapper) context).getBaseContext();
            default:
                if (!(context instanceof ContextWrapper)) {
                    return null;
                }
                return ((ContextWrapper) context).getBaseContext();
        }
    }
}
