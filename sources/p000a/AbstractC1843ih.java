package p000a;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.Process;
import android.provider.MediaStore;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Base64;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.util.Xml;
import android.view.ActionMode;
import android.view.View;
import android.widget.EdgeEffect;
import android.widget.TextView;
import androidx.lifecycle.SavedStateHandleAttacher;
import androidx.lifecycle.SavedStateHandleController;
import com.google.android.material.textfield.TextInputEditText;
import com.topjohnwu.magisk.R;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;
import p000a.AbstractC0783OZ;
import p000a.EnumC2241qF;
import p000a.InterfaceC1546d7;

/* renamed from: a.ih */
/* loaded from: classes.dex */
public abstract class AbstractC1843ih {

    /* renamed from: z */
    public static final char[] f5761z = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: h */
    public static final int[] f5754h = {16842755, 16843041, 16843093, 16843097, 16843551, 16843754, 16843771, 16843778, 16843779};

    /* renamed from: v */
    public static final int[] f5759v = {16842755, 16843189, 16843190, 16843556, 16843557, 16843558, 16843866, 16843867};

    /* renamed from: P */
    public static final int[] f5748P = {16842755, 16843780, 16843781, 16843782, 16843783, 16843784, 16843785, 16843786, 16843787, 16843788, 16843789, 16843979, 16843980, 16844062};

    /* renamed from: N */
    public static final int[] f5747N = {16842755, 16843781, 16844062};

    /* renamed from: Q */
    public static final int[] f5749Q = {16843161};

    /* renamed from: u */
    public static final int[] f5758u = {16842755, 16843213};

    /* renamed from: o */
    public static final int[] f5756o = {16843073, 16843160, 16843198, 16843199, 16843200, 16843486, 16843487, 16843488};

    /* renamed from: W */
    public static final int[] f5753W = {16843490};

    /* renamed from: G */
    public static final int[] f5744G = {16843486, 16843487, 16843488, 16843489};

    /* renamed from: M */
    public static final int[] f5746M = {16842788, 16843073, 16843488, 16843992};

    /* renamed from: V */
    public static final int[] f5752V = {16843489, 16843781, 16843892, 16843893};

    /* renamed from: S */
    public static final C0175DP f5751S = new C0175DP(1, "RESUME_TOKEN");

    /* renamed from: R */
    public static final Object[] f5750R = new Object[0];

    /* renamed from: w */
    public static final String[] f5760w = {"standard", "accelerate", "decelerate", "linear"};

    /* renamed from: I */
    public static final C1710g8 f5745I = new C1710g8();

    /* renamed from: q */
    public static final C1710g8 f5757q = new C1710g8();

    /* renamed from: k */
    public static final C1710g8 f5755k = new C1710g8();

    /* renamed from: B */
    public static final boolean m3397B(Object obj) {
        return obj == AbstractC0795Op.f2703P;
    }

    /* renamed from: BO */
    public static void m3398BO(TextView textView, CharSequence charSequence) {
        boolean z;
        boolean z2;
        CharSequence text = textView.getText();
        if (charSequence != text) {
            if (charSequence != null || text.length() != 0) {
                if (charSequence instanceof Spanned) {
                    if (charSequence.equals(text)) {
                        return;
                    }
                } else {
                    boolean z3 = true;
                    if (charSequence == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (text == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z == z2) {
                        if (charSequence != null) {
                            int length = charSequence.length();
                            if (length == text.length()) {
                                for (int i = 0; i < length; i++) {
                                    if (charSequence.charAt(i) != text.charAt(i)) {
                                        break;
                                    }
                                }
                            }
                        }
                        z3 = false;
                    }
                    if (!z3) {
                        return;
                    }
                }
                textView.setText(charSequence);
            }
        }
    }

    /* renamed from: BX */
    public static final Object[] m3399BX(Collection collection) {
        int size = collection.size();
        Object[] objArr = f5750R;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArr2 = new Object[size];
        int i = 0;
        while (true) {
            int i2 = i + 1;
            objArr2[i] = it.next();
            if (i2 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i3);
            } else if (!it.hasNext()) {
                return Arrays.copyOf(objArr2, i2);
            }
            i = i2;
        }
    }

    /* renamed from: C */
    public static Intent m3400C(Activity activity) {
        Intent m56z = AbstractC0023AQ.m56z(activity);
        if (m56z != null) {
            return m56z;
        }
        try {
            String m3447j = m3447j(activity, activity.getComponentName());
            if (m3447j == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, m3447j);
            try {
                if (m3447j(activity, componentName) == null) {
                    return Intent.makeMainActivity(componentName);
                }
                return new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + m3447j + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: D */
    public static final C0815PB m3401D(InterfaceC2364sT interfaceC2364sT) {
        C0893Qo c0893Qo = new C0893Qo();
        interfaceC2364sT.mo85W(c0893Qo);
        boolean z = c0893Qo.f3065h;
        C1822iJ c1822iJ = c0893Qo.f3067z;
        c1822iJ.getClass();
        boolean z2 = c0893Qo.f3066v;
        c1822iJ.getClass();
        int i = c0893Qo.f3064P;
        boolean z3 = c0893Qo.f3063N;
        c1822iJ.getClass();
        c1822iJ.getClass();
        c1822iJ.getClass();
        c1822iJ.getClass();
        return new C0815PB(z, z2, i, false, z3, c1822iJ.f5698z, c1822iJ.f5696h, c1822iJ.f5697v, c1822iJ.f5695P);
    }

    /* renamed from: E */
    public static final void m3402E(InterfaceC0277FG interfaceC0277FG) {
        boolean z;
        EnumC1632eh enumC1632eh = interfaceC0277FG.mo1354C().f1105P;
        if (enumC1632eh != EnumC1632eh.f5088R && enumC1632eh != EnumC1632eh.f5092w) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (interfaceC0277FG.mo576h().m3553h() == null) {
                C0842Ph c0842Ph = new C0842Ph(interfaceC0277FG.mo576h(), (InterfaceC0670Mg) interfaceC0277FG);
                interfaceC0277FG.mo576h().m3554v("androidx.lifecycle.internal.SavedStateHandlesProvider", c0842Ph);
                interfaceC0277FG.mo1354C().mo728z(new SavedStateHandleAttacher(c0842Ph));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: EC */
    public static void m3403EC(TextView textView, int i) {
        m3430W(i);
        if (Build.VERSION.SDK_INT >= 28) {
            AbstractC1356ZN.m2748P(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = AbstractC1266Xj.m2569z(textView) ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: EQ */
    public static boolean m3404EQ(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0097, code lost:
    
        r11 = new p000a.C0459Ih(r4, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x009c, code lost:
    
        p000a.AbstractC1292YB.m2659R(r1, null);
        r3 = r11;
     */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000a.InterfaceC0373H7 m3405F(java.lang.String r10, boolean r11) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            r2 = 2
            if (r0 >= r1) goto L31
            java.io.File r11 = new java.io.File
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()
            a.We r1 = p000a.C1212We.f3969z
            r1.getClass()
            a.LP[] r3 = p000a.C1212We.f3959h
            r2 = r3[r2]
            a.ak r3 = p000a.C1212We.f3953W
            java.lang.String r1 = r3.m2853O4(r1, r2)
            java.lang.String r1 = m3428UZ(r1)
            r11.<init>(r0, r1)
            r11.mkdirs()
            a.ZW r0 = new a.ZW
            java.io.File r1 = new java.io.File
            r1.<init>(r11, r10)
            r0.<init>(r1)
            return r0
        L31:
            if (r11 == 0) goto L35
            goto Laf
        L35:
            java.lang.String r11 = "_id"
            java.lang.String r0 = "_data"
            java.lang.String[] r5 = new java.lang.String[]{r11, r0}
            java.lang.String r6 = "_display_name == ?"
            java.lang.String[] r7 = new java.lang.String[]{r10}
            java.lang.String r8 = "date_added DESC"
            android.content.ContentResolver r3 = m3435c()
            android.net.Uri r4 = p000a.AbstractC0957Ry.m2124Q()
            android.database.Cursor r1 = r3.query(r4, r5, r6, r7, r8)
            r3 = 0
            if (r1 == 0) goto Lad
            int r11 = r1.getColumnIndexOrThrow(r11)     // Catch: java.lang.Throwable -> La1
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> La1
        L5c:
            boolean r4 = r1.moveToNext()     // Catch: java.lang.Throwable -> La1
            if (r4 == 0) goto La3
            long r4 = r1.getLong(r11)     // Catch: java.lang.Throwable -> La1
            java.lang.String r6 = r1.getString(r0)     // Catch: java.lang.Throwable -> La1
            a.We r7 = p000a.C1212We.f3969z     // Catch: java.lang.Throwable -> La1
            r7.getClass()     // Catch: java.lang.Throwable -> La1
            a.LP[] r8 = p000a.C1212We.f3959h     // Catch: java.lang.Throwable -> La1
            r8 = r8[r2]     // Catch: java.lang.Throwable -> La1
            a.ak r9 = p000a.C1212We.f3953W     // Catch: java.lang.Throwable -> La1
            java.lang.String r7 = r9.m2853O4(r7, r8)     // Catch: java.lang.Throwable -> La1
            java.lang.String r7 = m3428UZ(r7)     // Catch: java.lang.Throwable -> La1
            java.lang.String r8 = java.io.File.separator     // Catch: java.lang.Throwable -> La1
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La1
            r9.<init>()     // Catch: java.lang.Throwable -> La1
            r9.append(r7)     // Catch: java.lang.Throwable -> La1
            r9.append(r8)     // Catch: java.lang.Throwable -> La1
            r9.append(r10)     // Catch: java.lang.Throwable -> La1
            java.lang.String r7 = r9.toString()     // Catch: java.lang.Throwable -> La1
            boolean r7 = r6.endsWith(r7)     // Catch: java.lang.Throwable -> La1
            if (r7 == 0) goto L5c
            a.Ih r11 = new a.Ih     // Catch: java.lang.Throwable -> La1
            r11.<init>(r4, r6)     // Catch: java.lang.Throwable -> La1
            p000a.AbstractC1292YB.m2659R(r1, r3)
            r3 = r11
            goto Lad
        La1:
            r10 = move-exception
            goto La7
        La3:
            p000a.AbstractC1292YB.m2659R(r1, r3)
            goto Lad
        La7:
            throw r10     // Catch: java.lang.Throwable -> La8
        La8:
            r11 = move-exception
            p000a.AbstractC1292YB.m2659R(r1, r10)
            throw r11
        Lad:
            if (r3 != 0) goto Lb3
        Laf:
            a.Ih r3 = m3460t(r10)
        Lb3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractC1843ih.m3405F(java.lang.String, boolean):a.H7");
    }

    /* renamed from: Fu */
    public static String m3406Fu(InterfaceC0959S interfaceC0959S) {
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        if ((interfaceC0959S instanceof InterfaceC2175p) && !(interfaceC0959S instanceof C0538K9)) {
            String mo380Q = ((InterfaceC2175p) interfaceC0959S).mo380Q();
            if (mo380Q.length() > 0 && mo380Q.charAt(0) == '#') {
                stringBuffer.append('\\');
            }
            stringBuffer.append(mo380Q);
        } else {
            try {
                stringBuffer.append('#');
                byte[] m417M = interfaceC0959S.mo302N().m417M();
                C1998lZ c1998lZ = AbstractC2166oq.f6640z;
                stringBuffer.append(AbstractC1878jN.m3499z(AbstractC2166oq.m3778z(m417M, m417M.length)));
            } catch (IOException unused) {
                throw new IllegalArgumentException("Other value has no encoded form");
            }
        }
        int length = stringBuffer.length();
        int i2 = 2;
        if (stringBuffer.length() < 2 || stringBuffer.charAt(0) != '\\' || stringBuffer.charAt(1) != '#') {
            i2 = 0;
        }
        while (i2 != length) {
            char charAt = stringBuffer.charAt(i2);
            if (charAt != '\"' && charAt != '\\' && charAt != '+' && charAt != ',') {
                switch (charAt) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        break;
                    default:
                        i2++;
                        continue;
                }
            }
            stringBuffer.insert(i2, "\\");
            i2 += 2;
            length++;
        }
        if (stringBuffer.length() > 0) {
            while (stringBuffer.length() > i && stringBuffer.charAt(i) == ' ') {
                stringBuffer.insert(i, "\\");
                i += 2;
            }
        }
        for (int length2 = stringBuffer.length() - 1; length2 >= i && stringBuffer.charAt(length2) == ' '; length2--) {
            stringBuffer.insert(length2, '\\');
        }
        return stringBuffer.toString();
    }

    /* renamed from: G */
    public static void m3407G(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* renamed from: G5 */
    public static int m3408G5(CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            if (charAt != '\t' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: H */
    public static String m3409H(Uri uri) {
        if (AbstractC1292YB.m2695u(uri.getScheme(), "file")) {
            return AbstractC2575wW.m4427dG(uri).getName();
        }
        if (!AbstractC1292YB.m2695u(uri.getScheme(), "content")) {
            throw new IllegalArgumentException(("Uri lacks 'content' scheme: " + uri).toString());
        }
        Cursor query = m3435c().query(uri, new String[]{"_display_name"}, null, null, null);
        if (query != null) {
            try {
                int columnIndexOrThrow = query.getColumnIndexOrThrow("_display_name");
                if (query.moveToFirst()) {
                    String string = query.getString(columnIndexOrThrow);
                    AbstractC1292YB.m2659R(query, null);
                    return string;
                }
                AbstractC1292YB.m2659R(query, null);
            } finally {
            }
        }
        return uri.toString();
    }

    /* renamed from: HL */
    public static OutputStream m3410HL(Uri uri) {
        OutputStream openOutputStream = m3435c().openOutputStream(uri, "rwt");
        if (openOutputStream != null) {
            return openOutputStream;
        }
        throw new FileNotFoundException();
    }

    /* renamed from: Ha */
    public static void m3411Ha(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            AbstractC2152oa.m3768z(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC0007A7 viewOnLongClickListenerC0007A7 = ViewOnLongClickListenerC0007A7.f74E;
        if (viewOnLongClickListenerC0007A7 != null && viewOnLongClickListenerC0007A7.f78S == view) {
            ViewOnLongClickListenerC0007A7.m27h(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            ViewOnLongClickListenerC0007A7 viewOnLongClickListenerC0007A72 = ViewOnLongClickListenerC0007A7.f75f;
            if (viewOnLongClickListenerC0007A72 != null && viewOnLongClickListenerC0007A72.f78S == view) {
                viewOnLongClickListenerC0007A72.m29z();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new ViewOnLongClickListenerC0007A7(view, charSequence);
    }

    /* renamed from: I */
    public static float[] m3412I(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i2 = i - 0;
        int min = Math.min(i2, length - 0);
        float[] fArr2 = new float[i2];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }

    /* renamed from: J */
    public static final int m3413J(Cursor cursor, String str) {
        String str2;
        boolean z;
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = cursor.getColumnIndex("`" + str + '`');
            if (columnIndex < 0) {
                if (Build.VERSION.SDK_INT <= 25) {
                    if (str.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        String[] columnNames = cursor.getColumnNames();
                        String concat = ".".concat(str);
                        String str3 = "." + str + '`';
                        int length = columnNames.length;
                        int i = 0;
                        int i2 = 0;
                        while (i < length) {
                            String str4 = columnNames[i];
                            int i3 = i2 + 1;
                            if (str4.length() >= str.length() + 2 && (str4.endsWith(concat) || (str4.charAt(0) == '`' && str4.endsWith(str3)))) {
                                columnIndex = i2;
                                break;
                            }
                            i++;
                            i2 = i3;
                        }
                    }
                }
                columnIndex = -1;
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames2 = cursor.getColumnNames();
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "");
            int i4 = 0;
            for (String str5 : columnNames2) {
                i4++;
                if (i4 > 1) {
                    sb.append((CharSequence) ", ");
                }
                AbstractC0438II.m1009Q(sb, str5, null);
            }
            sb.append((CharSequence) "");
            str2 = sb.toString();
        } catch (Exception e) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e);
            str2 = "unknown";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + str2);
    }

    /* renamed from: K */
    public static boolean m3414K(int i, CharSequence charSequence) {
        if (i >= charSequence.length()) {
            return false;
        }
        char charAt = charSequence.charAt(i);
        switch (charAt) {
            case '!':
            case '\"':
            case '#':
            case '$':
            case '%':
            case '&':
            case '\'':
            case '(':
            case ')':
            case '*':
            case '+':
            case ',':
            case '-':
            case '.':
            case '/':
                return true;
            default:
                switch (charAt) {
                    case ':':
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                    case '?':
                    case '@':
                        return true;
                    default:
                        switch (charAt) {
                            case '[':
                            case '\\':
                            case ']':
                            case '^':
                            case '_':
                            case '`':
                                return true;
                            default:
                                switch (charAt) {
                                    case '{':
                                    case '|':
                                    case '}':
                                    case '~':
                                        return true;
                                    default:
                                        return false;
                                }
                        }
                }
        }
    }

    /* renamed from: L */
    public static final C1483bu m3415L(InterfaceC0670Mg interfaceC0670Mg) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2564wJ(AbstractC0274FD.m575z(C1483bu.class).mo1318z(), C1980lF.f6143w));
        C2564wJ[] c2564wJArr = (C2564wJ[]) arrayList.toArray(new C2564wJ[0]);
        return (C1483bu) new C1174Vy(interfaceC0670Mg, new C1591dy((C2564wJ[]) Arrays.copyOf(c2564wJArr, c2564wJArr.length))).m2396R(C1483bu.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    /* renamed from: Lq */
    public static void m3416Lq(Drawable drawable, PorterDuff.Mode mode) {
        AbstractC0235ET.m476W(drawable, mode);
    }

    /* renamed from: M */
    public static final void m3417M(int i) {
        boolean z = true;
        if (i < 1) {
            z = false;
        }
        if (z) {
        } else {
            throw new IllegalArgumentException(AbstractC2441tz.m4188N("Expected positive parallelism level, but got ", i).toString());
        }
    }

    /* renamed from: N */
    public static final void m3418N(AbstractC1952kk abstractC1952kk, C1934kN c1934kN, AbstractC0783OZ abstractC0783OZ) {
        Object obj;
        HashMap hashMap = abstractC1952kk.f6049S;
        if (hashMap == null) {
            obj = null;
        } else {
            synchronized (hashMap) {
                obj = abstractC1952kk.f6049S.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
        if (savedStateHandleController != null && !savedStateHandleController.f9012w) {
            savedStateHandleController.m4841o(abstractC0783OZ, c1934kN);
            m3438d3(abstractC0783OZ, c1934kN);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0031  */
    /* renamed from: O4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m3419O4(p000a.InterfaceC1634ej r4, java.util.ArrayList r5, p000a.InterfaceC1171Vv r6) {
        /*
            boolean r0 = r6 instanceof p000a.C2714zE
            if (r0 == 0) goto L13
            r0 = r6
            a.zE r0 = (p000a.C2714zE) r0
            int r1 = r0.f8543k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8543k = r1
            goto L18
        L13:
            a.zE r0 = new a.zE
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f8544q
            a.Im r1 = p000a.EnumC0464Im.f1557S
            int r2 = r0.f8543k
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.util.Collection r5 = r0.f8542I
            p000a.AbstractC1292YB.m2664UZ(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            p000a.AbstractC1292YB.m2664UZ(r6)
            a.CB r6 = new a.CB
            r2 = 0
            r6.<init>(r2, r5)
            r0.f8542I = r5
            r0.f8543k = r3
            java.lang.Object r4 = r4.mo1459z(r6, r0)
            if (r4 != r1) goto L45
            goto L46
        L45:
            r1 = r5
        L46:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractC1843ih.m3419O4(a.ej, java.util.ArrayList, a.Vv):java.lang.Object");
    }

    /* renamed from: P */
    public static int m3420P(View view) {
        boolean z;
        if (view.getAlpha() == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z && view.getVisibility() == 0) {
            return 4;
        }
        int visibility = view.getVisibility();
        if (visibility != 0) {
            if (visibility == 4) {
                return 4;
            }
            if (visibility == 8) {
                return 3;
            }
            throw new IllegalArgumentException(AbstractC2441tz.m4188N("Unknown visibility ", visibility));
        }
        return 2;
    }

    /* renamed from: Pm */
    public static int m3421Pm(char c, CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            if (charSequence.charAt(i) != c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: Q */
    public static final Bundle m3422Q(C0084Bc... c0084BcArr) {
        Bundle bundle = new Bundle(c0084BcArr.length);
        for (C0084Bc c0084Bc : c0084BcArr) {
            String str = (String) c0084Bc.f329S;
            Object obj = c0084Bc.f328R;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else {
                if (!(obj instanceof Serializable)) {
                    if (obj instanceof IBinder) {
                        AbstractC0229EM.m448z(bundle, str, (IBinder) obj);
                    } else if (obj instanceof Size) {
                        AbstractC0864QA.m1998z(bundle, str, (Size) obj);
                    } else if (obj instanceof SizeF) {
                        AbstractC0864QA.m1997h(bundle, str, (SizeF) obj);
                    } else {
                        throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                    }
                }
                bundle.putSerializable(str, (Serializable) obj);
            }
        }
        return bundle;
    }

    /* renamed from: Rh */
    public static ActionMode.Callback m3423Rh(ActionMode.Callback callback, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof ActionModeCallbackC1719gM) || callback == null) ? callback : new ActionModeCallbackC1719gM(callback, textView);
    }

    /* renamed from: Ry */
    public static final C2098nX m3424Ry(C2616xE c2616xE) {
        return new C2098nX(0, c2616xE);
    }

    /* renamed from: T */
    public static int m3425T(int i) {
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i != 8) {
                if (i == 16) {
                    return 4;
                }
                if (i != 32) {
                    if (i != 64) {
                        if (i != 128) {
                            if (i == 256) {
                                return 8;
                            }
                            throw new IllegalArgumentException(AbstractC2441tz.m4188N("type needs to be >= FIRST and <= LAST, type=", i));
                        }
                        return 7;
                    }
                    return 6;
                }
                return 5;
            }
            return 3;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x006d A[Catch: all -> 0x008f, TryCatch #1 {all -> 0x008f, blocks: (B:77:0x002f, B:86:0x0050, B:90:0x0065, B:92:0x006d, B:97:0x0078, B:99:0x007e, B:104:0x0091, B:106:0x0099, B:107:0x009e, B:108:0x00a0, B:109:0x00a1, B:110:0x00ac, B:82:0x0045, B:85:0x004c), top: B:127:0x0021 }] */
    /* JADX WARN: Type inference failed for: r10v4, types: [a.jD] */
    /* JADX WARN: Type inference failed for: r10v6, types: [a.jD] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:100:0x008c -> B:78:0x0032). Please submit an issue!!! */
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m3426U(p000a.InterfaceC2445u2 r9, p000a.C0744Nx r10, boolean r11, p000a.InterfaceC1171Vv r12) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractC1843ih.m3426U(a.u2, a.Nx, boolean, a.Vv):java.lang.Object");
    }

    /* renamed from: U8 */
    public static void m3427U8(TextView textView, int i) {
        m3430W(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = AbstractC1266Xj.m2569z(textView) ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* renamed from: UZ */
    public static String m3428UZ(String str) {
        if (str.length() == 0) {
            return Environment.DIRECTORY_DOWNLOADS;
        }
        return Environment.DIRECTORY_DOWNLOADS + File.separator + str;
    }

    /* renamed from: V */
    public static int m3429V(Context context, String str) {
        boolean z;
        int m3971v;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String m3969P = AbstractC2310rU.m3969P(str);
        if (m3969P != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            int myUid2 = Process.myUid();
            String packageName2 = context.getPackageName();
            if (myUid2 == myUid && AbstractC1451bD.m2871z(packageName2, packageName)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager m4353v = AbstractC2513vI.m4353v(context);
                    m3971v = AbstractC2513vI.m4354z(m4353v, m3969P, Binder.getCallingUid(), packageName);
                    if (m3971v == 0) {
                        m3971v = AbstractC2513vI.m4354z(m4353v, m3969P, myUid, AbstractC2513vI.m4352h(context));
                    }
                } else {
                    m3971v = AbstractC2310rU.m3971v((AppOpsManager) AbstractC2310rU.m3972z(context, AppOpsManager.class), m3969P, packageName);
                }
            } else {
                m3971v = AbstractC2310rU.m3971v((AppOpsManager) AbstractC2310rU.m3972z(context, AppOpsManager.class), m3969P, packageName);
            }
            if (m3971v != 0) {
                return -2;
            }
        }
        return 0;
    }

    /* renamed from: W */
    public static void m3430W(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: X */
    public static Drawable m3431X(Context context, int i) {
        return C0763OF.m1760P().m1764Q(context, i);
    }

    /* renamed from: Y */
    public static InterfaceC1634ej m3432Y(C2163on c2163on, InterfaceC0559KW interfaceC0559KW) {
        boolean z;
        int i = AbstractC1625ea.f5016z;
        C1199WP c1199wp = new C1199WP(c2163on, interfaceC0559KW);
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i == 1) {
                return new C2163on(c1199wp, 2);
            }
            return new C0653MK(c1199wp, i);
        }
        throw new IllegalArgumentException(AbstractC2441tz.m4188N("Expected positive concurrency level, but had ", i).toString());
    }

    /* renamed from: Z */
    public static int m3433Z(Bundle bundle, String str, int i) {
        Object obj = bundle.get(str);
        return obj == null ? i : obj instanceof Integer ? ((Number) obj).intValue() : obj instanceof Long ? (int) ((Number) obj).longValue() : i;
    }

    /* renamed from: ZH */
    public static void m3434ZH(Drawable drawable, ColorStateList colorStateList) {
        AbstractC0235ET.m478o(drawable, colorStateList);
    }

    /* renamed from: c */
    public static ContentResolver m3435c() {
        return AbstractC1743gn.m3275z().getContentResolver();
    }

    /* renamed from: d */
    public static String m3436d(int i, int i2) {
        StringBuilder sb = i != 64 ? i != 128 ? i != 192 ? new StringBuilder("[UNIVERSAL ") : new StringBuilder("[PRIVATE ") : new StringBuilder("[CONTEXT ") : new StringBuilder("[APPLICATION ");
        sb.append(i2);
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: d2 */
    public static final Object[] m3437d2(Collection collection, Object[] objArr) {
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size == 0) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        Object[] objArr2 = size <= objArr.length ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        while (true) {
            int i2 = i + 1;
            objArr2[i] = it.next();
            if (i2 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i3);
            } else if (!it.hasNext()) {
                if (objArr2 != objArr) {
                    return Arrays.copyOf(objArr2, i2);
                }
                objArr[i2] = null;
                return objArr;
            }
            i = i2;
        }
    }

    /* renamed from: d3 */
    public static void m3438d3(final AbstractC0783OZ abstractC0783OZ, final C1934kN c1934kN) {
        EnumC1632eh enumC1632eh = ((C0326GG) abstractC0783OZ).f1105P;
        if (enumC1632eh != EnumC1632eh.f5088R && !enumC1632eh.m3117z(EnumC1632eh.f5087I)) {
            abstractC0783OZ.mo728z(new InterfaceC1270Xo() { // from class: androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
                @Override // p000a.InterfaceC1270Xo
                /* renamed from: Q */
                public final void mo2596Q(InterfaceC1546d7 interfaceC1546d7, EnumC2241qF enumC2241qF) {
                    if (enumC2241qF == EnumC2241qF.ON_START) {
                        AbstractC0783OZ.this.mo724h(this);
                        c1934kN.m3552P();
                    }
                }
            });
        } else {
            c1934kN.m3552P();
        }
    }

    /* renamed from: dG */
    public static final String m3439dG(String str) {
        boolean z;
        InetAddress m3466y;
        int i = 0;
        int i2 = -1;
        if (AbstractC1269Xn.m2591nB(str, ":", false)) {
            if (str.startsWith("[") && str.endsWith("]")) {
                m3466y = m3466y(1, str.length() - 1, str);
            } else {
                m3466y = m3466y(0, str.length(), str);
            }
            if (m3466y == null) {
                return null;
            }
            byte[] address = m3466y.getAddress();
            if (address.length == 16) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < address.length) {
                    int i5 = i3;
                    while (i5 < 16 && address[i5] == 0 && address[i5 + 1] == 0) {
                        i5 += 2;
                    }
                    int i6 = i5 - i3;
                    if (i6 > i4 && i6 >= 4) {
                        i2 = i3;
                        i4 = i6;
                    }
                    i3 = i5 + 2;
                }
                C2361sQ c2361sQ = new C2361sQ();
                while (i < address.length) {
                    if (i == i2) {
                        c2361sQ.m4086nB(58);
                        i += i4;
                        if (i == 16) {
                            c2361sQ.m4086nB(58);
                        }
                    } else {
                        if (i > 0) {
                            c2361sQ.m4086nB(58);
                        }
                        byte b = address[i];
                        byte[] bArr = AbstractC1181W6.f3860z;
                        c2361sQ.m4090yF(((b & 255) << 8) | (address[i + 1] & 255));
                        i += 2;
                    }
                }
                return c2361sQ.m4087oI();
            }
            if (address.length == 4) {
                return m3466y.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (lowerCase.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return null;
            }
            int length = lowerCase.length();
            for (int i7 = 0; i7 < length; i7++) {
                char charAt = lowerCase.charAt(i7);
                if (AbstractC1292YB.m2696w(charAt, 31) > 0 && AbstractC1292YB.m2696w(charAt, 127) < 0 && AbstractC1269Xn.m2572Fu(" #%/:?@[\\]", charAt, 0, false, 6) == -1) {
                }
                i = 1;
                break;
            }
            if (i != 0) {
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: dx */
    public static void m3440dx(Drawable drawable, int i) {
        AbstractC0235ET.m479u(drawable, i);
    }

    /* renamed from: e */
    public static float m3441e(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC1765hA.m3293h(edgeEffect);
        }
        return 0.0f;
    }

    /* renamed from: f */
    public static final void m3442f(InterfaceC1265Xh interfaceC1265Xh) {
        if (interfaceC1265Xh.mo317h()) {
        } else {
            throw ((C0757O9) interfaceC1265Xh).m1741U();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0066, code lost:
    
        if (r5.isEmpty() == true) goto L69;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final p000a.C0827PQ m3443g(p000a.C0945Rm r7) {
        /*
            a.g8 r0 = p000a.AbstractC1843ih.f5745I
            java.lang.Object r0 = r7.m2111z(r0)
            a.FG r0 = (p000a.InterfaceC0277FG) r0
            if (r0 == 0) goto L90
            a.g8 r1 = p000a.AbstractC1843ih.f5757q
            java.lang.Object r1 = r7.m2111z(r1)
            a.Mg r1 = (p000a.InterfaceC0670Mg) r1
            if (r1 == 0) goto L88
            a.g8 r2 = p000a.AbstractC1843ih.f5755k
            java.lang.Object r2 = r7.m2111z(r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            a.g8 r3 = p000a.C1710g8.f5379U
            java.lang.Object r7 = r7.m2111z(r3)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L80
            a.kN r0 = r0.mo576h()
            a.RO r0 = r0.m3553h()
            boolean r3 = r0 instanceof p000a.C0842Ph
            r4 = 0
            if (r3 == 0) goto L36
            a.Ph r0 = (p000a.C0842Ph) r0
            goto L37
        L36:
            r0 = r4
        L37:
            if (r0 == 0) goto L78
            a.bu r1 = m3415L(r1)
            java.util.LinkedHashMap r3 = r1.f4622I
            java.lang.Object r3 = r3.get(r7)
            a.PQ r3 = (p000a.C0827PQ) r3
            if (r3 != 0) goto L77
            java.lang.Class[] r3 = p000a.C0827PQ.f2805Q
            r0.m1959h()
            android.os.Bundle r3 = r0.f2842v
            if (r3 == 0) goto L55
            android.os.Bundle r3 = r3.getBundle(r7)
            goto L56
        L55:
            r3 = r4
        L56:
            android.os.Bundle r5 = r0.f2842v
            if (r5 == 0) goto L5d
            r5.remove(r7)
        L5d:
            android.os.Bundle r5 = r0.f2842v
            if (r5 == 0) goto L69
            boolean r5 = r5.isEmpty()
            r6 = 1
            if (r5 != r6) goto L69
            goto L6a
        L69:
            r6 = 0
        L6a:
            if (r6 == 0) goto L6e
            r0.f2842v = r4
        L6e:
            a.PQ r3 = p000a.C1665fK.m3151o(r3, r2)
            java.util.LinkedHashMap r0 = r1.f4622I
            r0.put(r7, r3)
        L77:
            return r3
        L78:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call"
            r7.<init>(r0)
            throw r7
        L80:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "CreationExtras must have a value by `VIEW_MODEL_KEY`"
            r7.<init>(r0)
            throw r7
        L88:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`"
            r7.<init>(r0)
            throw r7
        L90:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractC1843ih.m3443g(a.Rm):a.PQ");
    }

    /* renamed from: h */
    public static final int m3444h(char c) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if ('0' <= c && c < ':') {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return c - '0';
        }
        char c2 = 'a';
        if ('a' <= c && c < 'g') {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            c2 = 'A';
            if ('A' > c || c >= 'G') {
                z3 = false;
            }
            if (!z3) {
                throw new IllegalArgumentException("Unexpected hex digit: " + c);
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: he */
    public static void m3445he(TextInputEditText textInputEditText, C0130CV c0130cv) {
        TextWatcher c2022m1;
        if (c0130cv == null) {
            c2022m1 = null;
        } else {
            c2022m1 = new C2022m1(c0130cv);
        }
        int i = AbstractC1602eA.f4917z;
        Object tag = textInputEditText.getTag(R.id.textWatcher);
        textInputEditText.setTag(R.id.textWatcher, c2022m1);
        TextWatcher textWatcher = (TextWatcher) tag;
        if (textWatcher != null) {
            textInputEditText.removeTextChangedListener(textWatcher);
        }
        if (c2022m1 != null) {
            textInputEditText.addTextChangedListener(c2022m1);
        }
    }

    /* renamed from: i */
    public static final AbstractC2025m7 m3446i(Object obj) {
        if (obj != AbstractC0795Op.f2703P) {
            return (AbstractC2025m7) obj;
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }

    /* renamed from: j */
    public static String m3447j(Context context, ComponentName componentName) {
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i = Build.VERSION.SDK_INT;
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i >= 29 ? 269222528 : i >= 24 ? 787072 : 640);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    /* renamed from: k */
    public static Path m3448k(String str) {
        Path path = new Path();
        C1992lT[] m3457q = m3457q(str);
        if (m3457q != null) {
            try {
                C1992lT.m3603h(m3457q, path);
                return path;
            } catch (RuntimeException e) {
                throw new RuntimeException(AbstractC2441tz.m4200k("Error in parsing ", str), e);
            }
        }
        return null;
    }

    /* renamed from: l */
    public static float m3449l(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC1765hA.m3294v(edgeEffect, f, f2);
        }
        AbstractC1137VH.m2332z(edgeEffect, f, f2);
        return f;
    }

    /* renamed from: m */
    public static void m3450m(Context context, boolean z, String str) {
        int i;
        C1212We c1212We = C1212We.f3969z;
        c1212We.getClass();
        if (((Number) C1212We.f3952V.m2368h(c1212We, C1212We.f3959h[6])).intValue() == 1) {
            if (z) {
                i = R.string.su_allow_toast;
            } else {
                i = R.string.su_deny_toast;
            }
            AbstractC1110Un.m2289z(new RunnableC1421ah(context, context.getString(i, str)));
        }
    }

    /* renamed from: n0 */
    public static void m3451n0(Context context, String str, Bundle bundle) {
        Object c1019t6;
        ApplicationInfo applicationInfo;
        Object c1019t62;
        if (bundle == null) {
            return;
        }
        boolean z = true;
        Object obj = null;
        if (AbstractC1292YB.m2695u(str, "log")) {
            int m3433Z = m3433Z(bundle, "from.uid", -1);
            boolean z2 = bundle.getBoolean("notify", true);
            int m3433Z2 = m3433Z(bundle, "policy", 2);
            int m3433Z3 = m3433Z(bundle, "to.uid", -1);
            int m3433Z4 = m3433Z(bundle, "pid", -1);
            String string = bundle.getString("command", "");
            int m3433Z5 = m3433Z(bundle, "target", -1);
            String string2 = bundle.getString("context", "");
            String string3 = bundle.getString("gids", "");
            PackageManager packageManager = context.getPackageManager();
            try {
                PackageInfo m1838Z = AbstractC0795Op.m1838Z(packageManager, m3433Z, m3433Z4);
                if (m1838Z != null) {
                    ApplicationInfo applicationInfo2 = m1838Z.applicationInfo;
                    int i = applicationInfo2.uid;
                    c1019t62 = new C0790Oi(i, m3433Z3, m3433Z4, packageManager.getNameForUid(i), AbstractC0795Op.m1835X(applicationInfo2, packageManager), string, m3433Z2, m3433Z5, string2, string3);
                } else {
                    c1019t62 = null;
                }
            } catch (Throwable th) {
                c1019t62 = new C1019T6(th);
            }
            if (c1019t62 instanceof C1019T6) {
                c1019t62 = null;
            }
            C0790Oi c0790Oi = (C0790Oi) c1019t62;
            if (c0790Oi == null) {
                c0790Oi = new C0790Oi(m3433Z, m3433Z3, m3433Z4, AbstractC2441tz.m4188N("[UID] ", m3433Z), AbstractC2441tz.m4188N("[UID] ", m3433Z), string, m3433Z2, m3433Z5, string2, string3);
            }
            if (z2) {
                if (c0790Oi.f2689u != 2) {
                    z = false;
                }
                m3450m(context, z, c0790Oi.f2682N);
            }
            AbstractC0438II.m1032l(new C2579wc(c0790Oi, null));
            return;
        }
        if (AbstractC1292YB.m2695u(str, "notify")) {
            int m3433Z6 = m3433Z(bundle, "from.uid", -1);
            int m3433Z7 = m3433Z(bundle, "pid", -1);
            int m3433Z8 = m3433Z(bundle, "policy", 2);
            PackageManager packageManager2 = context.getPackageManager();
            try {
                PackageInfo m1838Z2 = AbstractC0795Op.m1838Z(packageManager2, m3433Z6, m3433Z7);
                if (m1838Z2 != null && (applicationInfo = m1838Z2.applicationInfo) != null) {
                    c1019t6 = AbstractC0795Op.m1835X(applicationInfo, packageManager2);
                } else {
                    c1019t6 = null;
                }
            } catch (Throwable th2) {
                c1019t6 = new C1019T6(th2);
            }
            if (!(c1019t6 instanceof C1019T6)) {
                obj = c1019t6;
            }
            String str2 = (String) obj;
            if (str2 == null) {
                str2 = AbstractC2441tz.m4188N("[UID] ", m3433Z6);
            }
            if (m3433Z8 != 2) {
                z = false;
            }
            m3450m(context, z, str2);
        }
    }

    /* renamed from: nF */
    public static List m3452nF(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (AbstractC2399tA.m4132z(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x009a, code lost:
    
        if (r7 >= r0) goto L107;
     */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m3453o(p000a.InterfaceC0959S r9) {
        /*
            java.lang.String r9 = m3406Fu(r9)
            int r0 = r9.length()
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L5c
            char r0 = r9.charAt(r2)
            r3 = 35
            if (r0 != r3) goto L5c
            int r0 = r9.length()     // Catch: java.io.IOException -> L47
            int r0 = r0 - r1
            a.lZ r3 = p000a.AbstractC2166oq.f6640z     // Catch: java.lang.Exception -> L2e
            byte[] r0 = r3.m3623z(r1, r0, r9)     // Catch: java.lang.Exception -> L2e
            a.e r0 = p000a.AbstractC1593e.m3067q(r0)     // Catch: java.io.IOException -> L47
            boolean r3 = r0 instanceof p000a.InterfaceC2175p
            if (r3 == 0) goto L5c
            a.p r0 = (p000a.InterfaceC2175p) r0
            java.lang.String r9 = r0.mo380Q()
            goto L5c
        L2e:
            r9 = move-exception
            a.H r0 = new a.H     // Catch: java.io.IOException -> L47
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L47
            java.lang.String r3 = "exception decoding Hex string: "
            r2.<init>(r3)     // Catch: java.io.IOException -> L47
            java.lang.String r3 = r9.getMessage()     // Catch: java.io.IOException -> L47
            r2.append(r3)     // Catch: java.io.IOException -> L47
            java.lang.String r2 = r2.toString()     // Catch: java.io.IOException -> L47
            r0.<init>(r1, r2, r9)     // Catch: java.io.IOException -> L47
            throw r0     // Catch: java.io.IOException -> L47
        L47:
            r9 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "unknown encoding in name: "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9)
            throw r0
        L5c:
            java.lang.String r9 = p000a.AbstractC1878jN.m3498v(r9)
            int r0 = r9.length()
            r3 = 2
            if (r0 >= r3) goto L69
            goto Lcf
        L69:
            int r0 = r0 - r1
            r3 = r2
        L6b:
            r4 = 92
            r5 = 32
            if (r3 >= r0) goto L82
            char r6 = r9.charAt(r3)
            if (r6 != r4) goto L82
            int r6 = r3 + 1
            char r6 = r9.charAt(r6)
            if (r6 != r5) goto L82
            int r3 = r3 + 2
            goto L6b
        L82:
            int r6 = r3 + 1
            r7 = r0
        L85:
            if (r7 <= r6) goto L98
            int r8 = r7 + (-1)
            char r8 = r9.charAt(r8)
            if (r8 != r4) goto L98
            char r8 = r9.charAt(r7)
            if (r8 != r5) goto L98
            int r7 = r7 + (-2)
            goto L85
        L98:
            if (r3 > 0) goto L9c
            if (r7 >= r0) goto La1
        L9c:
            int r7 = r7 + r1
            java.lang.String r9 = r9.substring(r3, r7)
        La1:
            java.lang.String r0 = "  "
            int r0 = r9.indexOf(r0)
            if (r0 >= 0) goto Laa
            goto Lcf
        Laa:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            char r2 = r9.charAt(r2)
            r0.append(r2)
        Lb6:
            int r3 = r9.length()
            if (r1 >= r3) goto Lcb
            char r3 = r9.charAt(r1)
            if (r2 != r5) goto Lc4
            if (r3 == r5) goto Lc8
        Lc4:
            r0.append(r3)
            r2 = r3
        Lc8:
            int r1 = r1 + 1
            goto Lb6
        Lcb:
            java.lang.String r9 = r0.toString()
        Lcf:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractC1843ih.m3453o(a.S):java.lang.String");
    }

    /* renamed from: oI */
    public static void m3454oI(XmlResourceParser xmlResourceParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* renamed from: od */
    public static InterfaceC2362sR m3455od(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i;
        boolean z;
        int i2;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlResourceParser.require(2, null, "font-family");
            if (xmlResourceParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1249XL.f4053h);
                String string = obtainAttributes.getString(0);
                String string2 = obtainAttributes.getString(4);
                String string3 = obtainAttributes.getString(5);
                int resourceId = obtainAttributes.getResourceId(1, 0);
                int integer = obtainAttributes.getInteger(2, 1);
                int integer2 = obtainAttributes.getInteger(3, 500);
                String string4 = obtainAttributes.getString(6);
                obtainAttributes.recycle();
                if (string != null && string2 != null && string3 != null) {
                    while (xmlResourceParser.next() != 3) {
                        m3454oI(xmlResourceParser);
                    }
                    return new C0735No(new C2226py(string, string2, string3, m3452nF(resources, resourceId)), integer, integer2, string4);
                }
                ArrayList arrayList = new ArrayList();
                while (xmlResourceParser.next() != 3) {
                    if (xmlResourceParser.getEventType() == 2) {
                        if (xmlResourceParser.getName().equals("font")) {
                            TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1249XL.f4054v);
                            int i3 = 8;
                            if (!obtainAttributes2.hasValue(8)) {
                                i3 = 1;
                            }
                            int i4 = obtainAttributes2.getInt(i3, 400);
                            if (obtainAttributes2.hasValue(6)) {
                                i = 6;
                            } else {
                                i = 2;
                            }
                            if (1 == obtainAttributes2.getInt(i, 0)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            int i5 = 9;
                            if (!obtainAttributes2.hasValue(9)) {
                                i5 = 3;
                            }
                            int i6 = 7;
                            if (!obtainAttributes2.hasValue(7)) {
                                i6 = 4;
                            }
                            String string5 = obtainAttributes2.getString(i6);
                            int i7 = obtainAttributes2.getInt(i5, 0);
                            if (obtainAttributes2.hasValue(5)) {
                                i2 = 5;
                            } else {
                                i2 = 0;
                            }
                            int resourceId2 = obtainAttributes2.getResourceId(i2, 0);
                            String string6 = obtainAttributes2.getString(i2);
                            obtainAttributes2.recycle();
                            while (xmlResourceParser.next() != 3) {
                                m3454oI(xmlResourceParser);
                            }
                            arrayList.add(new C2474ub(i4, i7, resourceId2, string6, string5, z));
                        } else {
                            m3454oI(xmlResourceParser);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    return new C1084UI((C2474ub[]) arrayList.toArray(new C2474ub[0]));
                }
            } else {
                m3454oI(xmlResourceParser);
            }
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: p */
    public static Intent m3456p(Context context, ComponentName componentName) {
        String m3447j = m3447j(context, componentName);
        if (m3447j == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), m3447j);
        return m3447j(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x008a, code lost:
    
        if (r13 == 0) goto L128;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0097 A[Catch: NumberFormatException -> 0x00bc, LOOP:3: B:115:0x006c->B:135:0x0097, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00bc, blocks: (B:112:0x0059, B:115:0x006c, B:117:0x0072, B:122:0x0080, B:135:0x0097, B:137:0x009c, B:140:0x00ac, B:142:0x00b1), top: B:157:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x009c A[Catch: NumberFormatException -> 0x00bc, TryCatch #0 {NumberFormatException -> 0x00bc, blocks: (B:112:0x0059, B:115:0x006c, B:117:0x0072, B:122:0x0080, B:135:0x0097, B:137:0x009c, B:140:0x00ac, B:142:0x00b1), top: B:157:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00ac A[Catch: NumberFormatException -> 0x00bc, TryCatch #0 {NumberFormatException -> 0x00bc, blocks: (B:112:0x0059, B:115:0x006c, B:117:0x0072, B:122:0x0080, B:135:0x0097, B:137:0x009c, B:140:0x00ac, B:142:0x00b1), top: B:157:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0096 A[SYNTHETIC] */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000a.C1992lT[] m3457q(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractC1843ih.m3457q(java.lang.String):a.lT[]");
    }

    /* renamed from: r */
    public static C0368H0 m3458r(C1628ed c1628ed, int i, ArrayList arrayList, C0368H0 c0368h0) {
        int i2;
        boolean z;
        C0287FS c0287fs;
        int i3;
        if (i == 0) {
            i2 = c1628ed.f5053ZH;
        } else {
            i2 = c1628ed.f5035Lq;
        }
        int i4 = 0;
        if (i2 != -1 && (c0368h0 == null || i2 != c0368h0.f1271h)) {
            int i5 = 0;
            while (true) {
                if (i5 >= arrayList.size()) {
                    break;
                }
                C0368H0 c0368h02 = (C0368H0) arrayList.get(i5);
                if (c0368h02.f1271h == i2) {
                    if (c0368h0 != null) {
                        c0368h0.m847v(i, c0368h02);
                        arrayList.remove(c0368h0);
                    }
                    c0368h0 = c0368h02;
                } else {
                    i5++;
                }
            }
        } else if (i2 != -1) {
            return c0368h0;
        }
        if (c0368h0 == null) {
            if (c1628ed instanceof AbstractC1389a2) {
                AbstractC1389a2 abstractC1389a2 = (AbstractC1389a2) c1628ed;
                int i6 = 0;
                while (true) {
                    if (i6 < abstractC1389a2.f4326oI) {
                        C1628ed c1628ed2 = abstractC1389a2.f4325Pm[i6];
                        if ((i == 0 && (i3 = c1628ed2.f5053ZH) != -1) || (i == 1 && (i3 = c1628ed2.f5035Lq) != -1)) {
                            break;
                        }
                        i6++;
                    } else {
                        i3 = -1;
                        break;
                    }
                }
                if (i3 != -1) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= arrayList.size()) {
                            break;
                        }
                        C0368H0 c0368h03 = (C0368H0) arrayList.get(i7);
                        if (c0368h03.f1271h == i3) {
                            c0368h0 = c0368h03;
                            break;
                        }
                        i7++;
                    }
                }
            }
            if (c0368h0 == null) {
                c0368h0 = new C0368H0(i);
            }
            arrayList.add(c0368h0);
        }
        ArrayList arrayList2 = c0368h0.f1273z;
        if (arrayList2.contains(c1628ed)) {
            z = false;
        } else {
            arrayList2.add(c1628ed);
            z = true;
        }
        if (z) {
            if (c1628ed instanceof C2009ln) {
                C2009ln c2009ln = (C2009ln) c1628ed;
                C0287FS c0287fs2 = c2009ln.f6236BX;
                if (c2009ln.f6239d2 == 0) {
                    i4 = 1;
                }
                c0287fs2.m595v(i4, c0368h0, arrayList);
            }
            int i8 = c0368h0.f1271h;
            if (i == 0) {
                c1628ed.f5053ZH = i8;
                c1628ed.f5022C.m595v(i, c0368h0, arrayList);
                c0287fs = c1628ed.f5064j;
            } else {
                c1628ed.f5035Lq = i8;
                c1628ed.f5074p.m595v(i, c0368h0, arrayList);
                c1628ed.f5063i.m595v(i, c0368h0, arrayList);
                c0287fs = c1628ed.f5034L;
            }
            c0287fs.m595v(i, c0368h0, arrayList);
            c1628ed.f5068n.m595v(i, c0368h0, arrayList);
        }
        return c0368h0;
    }

    /* renamed from: s */
    public static C1992lT[] m3459s(C1992lT[] c1992lTArr) {
        if (c1992lTArr == null) {
            return null;
        }
        C1992lT[] c1992lTArr2 = new C1992lT[c1992lTArr.length];
        for (int i = 0; i < c1992lTArr.length; i++) {
            c1992lTArr2[i] = new C1992lT(c1992lTArr[i]);
        }
        return c1992lTArr2;
    }

    /* renamed from: t */
    public static C0459Ih m3460t(String str) {
        Uri uri;
        ContentValues contentValues = new ContentValues();
        C1212We c1212We = C1212We.f3969z;
        c1212We.getClass();
        contentValues.put("relative_path", m3428UZ(C1212We.f3953W.m2853O4(c1212We, C1212We.f3959h[2])));
        contentValues.put("_display_name", str);
        ContentResolver m3435c = m3435c();
        uri = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
        Uri insert = m3435c.insert(uri, contentValues);
        if (insert != null) {
            Cursor query = m3435c().query(insert, new String[]{"_id", "_data"}, null, null, null);
            if (query != null) {
                try {
                    int columnIndexOrThrow = query.getColumnIndexOrThrow("_id");
                    int columnIndexOrThrow2 = query.getColumnIndexOrThrow("_data");
                    if (query.moveToFirst()) {
                        C0459Ih c0459Ih = new C0459Ih(query.getLong(columnIndexOrThrow), query.getString(columnIndexOrThrow2));
                        AbstractC1292YB.m2659R(query, null);
                        return c0459Ih;
                    }
                    AbstractC1292YB.m2659R(query, null);
                } finally {
                }
            }
            throw new IOException(AbstractC2441tz.m4184G("Can't insert ", str, "."));
        }
        throw new IOException(AbstractC2441tz.m4184G("Can't insert ", str, "."));
    }

    /* renamed from: tJ */
    public static ActionMode.Callback m3461tJ(ActionMode.Callback callback) {
        if ((callback instanceof ActionModeCallbackC1719gM) && Build.VERSION.SDK_INT >= 26) {
            return ((ActionModeCallbackC1719gM) callback).f5402z;
        }
        return callback;
    }

    /* renamed from: u */
    public static boolean m3462u(C1992lT[] c1992lTArr, C1992lT[] c1992lTArr2) {
        if (c1992lTArr == null || c1992lTArr2 == null || c1992lTArr.length != c1992lTArr2.length) {
            return false;
        }
        for (int i = 0; i < c1992lTArr.length; i++) {
            C1992lT c1992lT = c1992lTArr[i];
            char c = c1992lT.f6172z;
            C1992lT c1992lT2 = c1992lTArr2[i];
            if (c != c1992lT2.f6172z || c1992lT.f6171h.length != c1992lT2.f6171h.length) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: v */
    public static void m3463v(StringBuffer stringBuffer, C2425th c2425th, Hashtable hashtable) {
        String str = (String) hashtable.get(c2425th.f7427S);
        if (str == null) {
            str = c2425th.f7427S.f4116S;
        }
        stringBuffer.append(str);
        stringBuffer.append('=');
        stringBuffer.append(m3406Fu(c2425th.f7426R));
    }

    /* renamed from: w */
    public static int m3464w(char c) {
        if ('0' > c || c > '9') {
            return (('a' > c || c > 'f') ? c - 'A' : c - 'a') + 10;
        }
        return c - '0';
    }

    /* renamed from: x */
    public static final void m3465x(InterfaceC1255XS interfaceC1255XS, Throwable th) {
        Throwable runtimeException;
        Iterator it = AbstractC1204WV.f3916z.iterator();
        while (it.hasNext()) {
            try {
                ((C1123V1) ((InterfaceC2000lc) it.next())).m2309C(interfaceC1255XS, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    AbstractC1292YB.m2655N(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            AbstractC1292YB.m2655N(th, new C0272FB(interfaceC1255XS));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    /* JADX WARN: Code restructure failed: missing block: B:165:0x00dc, code lost:
    
        return null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00af  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.net.InetAddress m3466y(int r17, int r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractC1843ih.m3466y(int, int, java.lang.String):java.net.InetAddress");
    }

    /* renamed from: yF */
    public static String m3467yF(String str) {
        int i;
        if (str.length() == 0 || (str.indexOf(92) < 0 && str.indexOf(34) < 0)) {
            return str.trim();
        }
        char[] charArray = str.toCharArray();
        StringBuffer stringBuffer = new StringBuffer(str.length());
        if (charArray[0] == '\\' && charArray[1] == '#') {
            stringBuffer.append("\\#");
            i = 2;
        } else {
            i = 0;
        }
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        char c = 0;
        while (i != charArray.length) {
            char c2 = charArray[i];
            if (c2 != ' ') {
                z3 = true;
            }
            if (c2 != '\"') {
                if (c2 == '\\' && !z && !z2) {
                    i2 = stringBuffer.length();
                    z = true;
                } else if (c2 != ' ' || z || z3) {
                    if (z) {
                        if (('0' <= c2 && c2 <= '9') || ('a' <= c2 && c2 <= 'f') || ('A' <= c2 && c2 <= 'F')) {
                            if (c != 0) {
                                stringBuffer.append((char) (m3464w(c2) + (m3464w(c) * 16)));
                                z = false;
                                c = 0;
                            } else {
                                c = c2;
                            }
                        }
                    }
                }
                i++;
            } else if (!z) {
                z2 = !z2;
                z = false;
                i++;
            }
            stringBuffer.append(c2);
            z = false;
            i++;
        }
        if (stringBuffer.length() > 0) {
            while (stringBuffer.charAt(stringBuffer.length() - 1) == ' ' && i2 != stringBuffer.length() - 1) {
                stringBuffer.setLength(stringBuffer.length() - 1);
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: z */
    public static final C0442IO m3468z(InterfaceC1255XS interfaceC1255XS) {
        if (interfaceC1255XS.mo107y(C1710g8.f5381k) == null) {
            interfaceC1255XS = interfaceC1255XS.mo104G(new C1886jW(null));
        }
        return new C0442IO(interfaceC1255XS);
    }

    /* renamed from: zx */
    public static void m3469zx(Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC1923k9.m3547z(theme);
            return;
        }
        synchronized (AbstractC0933RZ.f3203z) {
            if (!AbstractC0933RZ.f3202v) {
                try {
                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                    AbstractC0933RZ.f3201h = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                }
                AbstractC0933RZ.f3202v = true;
            }
            Method method = AbstractC0933RZ.f3201h;
            if (method != null) {
                try {
                    method.invoke(theme, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException e2) {
                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                    AbstractC0933RZ.f3201h = null;
                }
            }
        }
    }

    /* renamed from: O */
    public int mo2818O(View view) {
        return 0;
    }

    /* renamed from: R */
    public abstract int mo1673R(View view, int i);

    /* renamed from: S */
    public abstract int mo1674S(View view, int i);

    /* renamed from: Yd */
    public abstract void mo1675Yd(View view, int i, int i2);

    /* renamed from: b */
    public void mo2819b(View view, int i) {
    }

    /* renamed from: n */
    public int mo1676n() {
        return 0;
    }

    /* renamed from: nB */
    public abstract boolean mo1677nB(View view, int i);

    /* renamed from: nP */
    public abstract void mo1678nP(int i);

    /* renamed from: qn */
    public abstract void mo1679qn(View view, float f, float f2);
}
