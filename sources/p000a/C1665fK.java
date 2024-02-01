package p000a;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.method.KeyListener;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.topjohnwu.magisk.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: a.fK */
/* loaded from: classes.dex */
public class C1665fK implements InterfaceC0656MP, InterfaceC1435aw, InterfaceC0310Fv {

    /* renamed from: S */
    public final /* synthetic */ int f5200S;

    public /* synthetic */ C1665fK() {
        this.f5200S = 1;
    }

    /* renamed from: G */
    public static void m3142G(Activity activity, EnumC2241qF enumC2241qF) {
        if (activity instanceof InterfaceC1546d7) {
            C0326GG mo1354C = ((InterfaceC1546d7) activity).mo1354C();
            if (mo1354C instanceof C0326GG) {
                mo1354C.m721N(enumC2241qF);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x0050, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0080, code lost:
    
        if (r11 != false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x008d, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L180;
     */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m3143I(android.view.inputmethod.InputConnection r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1665fK.m3143I(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
    }

    /* renamed from: J */
    public static boolean m3144J(String str) {
        if (str != null) {
            return str.length() > 0;
        }
        return false;
    }

    /* renamed from: M */
    public static C1420ag m3145M(C1951kj c1951kj) {
        Object next;
        Iterator it = AbstractC0873QM.m2010BX(c1951kj.m3572V(c1951kj.f6046f, true), C1980lF.f6130Y).iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        do {
            next = it.next();
        } while (it.hasNext());
        return (C1420ag) next;
    }

    /* renamed from: N */
    public static final int m3146N(TypedArray typedArray, View view, int i) {
        return typedArray.getType(i) == 1 ? view.getContext().getResources().getInteger(typedArray.getResourceId(i, 0)) : typedArray.getInt(i, 0);
    }

    /* renamed from: P */
    public static final void m3147P(int i, Activity activity, C1665fK c1665fK) {
        c1665fK.getClass();
        C1212We c1212We = C1212We.f3969z;
        c1212We.getClass();
        C1212We.f3967w.m1197nB(c1212We, C1212We.f3959h[9], i);
        LayoutInflaterFactory2C1392a6 layoutInflaterFactory2C1392a6 = (LayoutInflaterFactory2C1392a6) ((AbstractActivityC0819PG) activity).m1201R();
        if (layoutInflaterFactory2C1392a6.f4385zx != i) {
            layoutInflaterFactory2C1392a6.f4385zx = i;
            if (layoutInflaterFactory2C1392a6.f4381qn) {
                layoutInflaterFactory2C1392a6.m2787I(true, true);
            }
        }
    }

    /* renamed from: Q */
    public static AbstractC0929RT m3148Q(TypedValue typedValue, AbstractC0929RT abstractC0929RT, C0930RU c0930ru, String str, String str2) {
        if (abstractC0929RT == null || abstractC0929RT == c0930ru) {
            return abstractC0929RT == null ? c0930ru : abstractC0929RT;
        }
        throw new XmlPullParserException("Type is " + str + " but found " + str2 + ": " + typedValue.data);
    }

    /* renamed from: V */
    public static String m3149V(Context context, int i) {
        if (i > 16777215) {
            try {
                return context.getResources().getResourceName(i);
            } catch (Resources.NotFoundException unused) {
                return String.valueOf(i);
            }
        }
        return String.valueOf(i);
    }

    /* renamed from: W */
    public static boolean m3150W(String str, String str2) {
        boolean z;
        boolean z2;
        if (AbstractC1292YB.m2695u(str, str2)) {
            return true;
        }
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i < str.length()) {
                    char charAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt == '(') {
                        i2++;
                    } else if (charAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                        break;
                    }
                    i++;
                    i3 = i4;
                } else if (i2 == 0) {
                    z2 = true;
                }
            }
        }
        z2 = false;
        if (!z2) {
            return false;
        }
        return AbstractC1292YB.m2695u(AbstractC1269Xn.m2580Uf(str.substring(1, str.length() - 1)).toString(), str2);
    }

    /* renamed from: o */
    public static C0827PQ m3151o(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new C0827PQ();
            }
            HashMap hashMap = new HashMap();
            for (String str : bundle2.keySet()) {
                hashMap.put(str, bundle2.get(str));
            }
            return new C0827PQ(hashMap);
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (!((parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) ? false : true)) {
            throw new IllegalStateException("Invalid bundle passed as restored state".toString());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = parcelableArrayList.size();
        for (int i = 0; i < size; i++) {
            linkedHashMap.put((String) parcelableArrayList.get(i), parcelableArrayList2.get(i));
        }
        return new C0827PQ(linkedHashMap);
    }

    /* renamed from: q */
    public static void m3152q(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            C1406aN.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new C1406aN());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC0177DR(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* renamed from: u */
    public static C1553dE m3153u(Context context, C1420ag c1420ag, Bundle bundle, EnumC1632eh enumC1632eh, C0401Hd c0401Hd) {
        return new C1553dE(context, c1420ag, bundle, enumC1632eh, c0401Hd, UUID.randomUUID().toString(), null);
    }

    /* renamed from: w */
    public static String m3154w(Class cls) {
        LinkedHashMap linkedHashMap = C1931kK.f5996h;
        String str = (String) linkedHashMap.get(cls);
        if (str == null) {
            InterfaceC2240qD interfaceC2240qD = (InterfaceC2240qD) cls.getAnnotation(InterfaceC2240qD.class);
            if (interfaceC2240qD != null) {
                str = interfaceC2240qD.value();
            } else {
                str = null;
            }
            if (m3144J(str)) {
                linkedHashMap.put(cls, str);
            } else {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()).toString());
            }
        }
        return str;
    }

    /* renamed from: E */
    public void mo2374E(boolean z) {
    }

    /* renamed from: R */
    public KeyListener mo3155R(KeyListener keyListener) {
        return keyListener;
    }

    /* renamed from: S */
    public InputFilter[] mo2032S(InputFilter[] inputFilterArr) {
        return inputFilterArr;
    }

    /* renamed from: U */
    public void mo159U(boolean z) {
    }

    /* renamed from: Y */
    public void mo1263Y() {
    }

    /* renamed from: c */
    public TransformationMethod mo2033c(TransformationMethod transformationMethod) {
        return transformationMethod;
    }

    /* renamed from: f */
    public void mo2034f(boolean z) {
    }

    /* renamed from: g */
    public InputConnection mo3156g(InputConnection inputConnection, EditorInfo editorInfo) {
        return inputConnection;
    }

    @Override // p000a.InterfaceC1435aw
    /* renamed from: h */
    public void mo363h(DialogC2727zU dialogC2727zU) {
        int i = 3;
        int i2 = 1;
        switch (this.f5200S) {
            case AbstractC0795Op.f2698E /* 0 */:
                Activity ownerActivity = dialogC2727zU.getOwnerActivity();
                dialogC2727zU.setTitle(R.string.settings_dark_mode_title);
                dialogC2727zU.m4656G(R.string.settings_dark_mode_message, new Object[0]);
                dialogC2727zU.m4657W(EnumC1224Wr.f3992S, new C1044Ta(i2, ownerActivity, this));
                dialogC2727zU.m4657W(EnumC1224Wr.f3991R, new C1044Ta(i, ownerActivity, this));
                dialogC2727zU.m4657W(EnumC1224Wr.f3993w, new C1044Ta(5, ownerActivity, this));
                return;
            case 1:
                dialogC2727zU.setTitle(17039380);
                dialogC2727zU.m4656G(R.string.install_inactive_slot_msg, new Object[0]);
                dialogC2727zU.m4657W(EnumC1224Wr.f3992S, C1980lF.f6136i);
                dialogC2727zU.setCancelable(true);
                return;
            default:
                dialogC2727zU.setTitle(R.string.uninstall_magisk_title);
                dialogC2727zU.m4656G(R.string.uninstall_magisk_msg, new Object[0]);
                dialogC2727zU.m4657W(EnumC1224Wr.f3992S, new C1866j9(this, dialogC2727zU, i2));
                dialogC2727zU.m4657W(EnumC1224Wr.f3993w, new C1866j9(this, dialogC2727zU, i));
                return;
        }
    }

    /* renamed from: k */
    public boolean mo2035k() {
        return false;
    }

    /* renamed from: r */
    public void mo2267r() {
    }

    /* renamed from: s */
    public void mo2036s(boolean z) {
    }

    @Override // p000a.InterfaceC0656MP
    /* renamed from: v */
    public boolean mo1242v(C2189pE c2189pE) {
        return false;
    }

    /* renamed from: y */
    public void m3157y(int i, Object obj) {
        String str;
        switch (this.f5200S) {
            case 14:
                return;
            default:
                switch (i) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case 3:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case 9:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i != 6 && i != 7 && i != 8) {
                    Log.d("ProfileInstaller", str);
                    return;
                } else {
                    Log.e("ProfileInstaller", str, (Throwable) obj);
                    return;
                }
        }
    }

    @Override // p000a.InterfaceC0656MP
    /* renamed from: z */
    public void mo1243z(C2189pE c2189pE, boolean z) {
    }

    public /* synthetic */ C1665fK(int i) {
        this.f5200S = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1665fK(int i, int i2) {
        this(2);
        this.f5200S = i;
        int i3 = 3;
        if (i == 3) {
            this(i3);
            return;
        }
        int i4 = 4;
        if (i == 4) {
            this(i4);
            return;
        }
        int i5 = 5;
        if (i == 5) {
            this(i5);
            return;
        }
        int i6 = 7;
        if (i != 7) {
            switch (i) {
                case 20:
                    this(20);
                    return;
                case 21:
                    this(21);
                    return;
                case 22:
                    this(22);
                    return;
                case 23:
                    this(23);
                    return;
                case 24:
                    this(24);
                    return;
                case 25:
                    this(25);
                    return;
                case 26:
                    this(26);
                    return;
                case 27:
                    this(27);
                    return;
                case 28:
                    this(28);
                    return;
                case 29:
                    this(29);
                    return;
                default:
                    return;
            }
        }
        this(i6);
    }
}
