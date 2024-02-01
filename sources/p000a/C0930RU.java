package p000a;

import android.os.Bundle;
import java.util.Arrays;

/* renamed from: a.RU */
/* loaded from: classes.dex */
public final class C0930RU extends AbstractC0929RT {

    /* renamed from: S */
    public final /* synthetic */ int f3196S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0930RU(int i) {
        super(true);
        this.f3196S = i;
    }

    /* renamed from: G */
    public static boolean[] m2084G(String str) {
        return new boolean[]{((Boolean) AbstractC0929RT.f3190W.mo1955v(str)).booleanValue()};
    }

    /* renamed from: W */
    public static long[] m2085W(String str) {
        return new long[]{((Number) AbstractC0929RT.f3186N.mo1955v(str)).longValue()};
    }

    /* renamed from: o */
    public static int[] m2086o(String str) {
        return new int[]{((Number) AbstractC0929RT.f3191h.mo1955v(str)).intValue()};
    }

    /* renamed from: u */
    public static float[] m2087u(String str) {
        return new float[]{((Number) AbstractC0929RT.f3193u.mo1955v(str)).floatValue()};
    }

    @Override // p000a.AbstractC0929RT
    /* renamed from: N */
    public final void mo1953N(Bundle bundle, String str, Object obj) {
        int i = this.f3196S;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                bundle.putBooleanArray(str, (boolean[]) obj);
                return;
            case 1:
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                return;
            case 2:
                bundle.putFloatArray(str, (float[]) obj);
                return;
            case 3:
                bundle.putFloat(str, ((Number) obj).floatValue());
                return;
            case 4:
                bundle.putIntArray(str, (int[]) obj);
                return;
            case 5:
                int intValue = ((Number) obj).intValue();
                switch (i) {
                    case 5:
                        bundle.putInt(str, intValue);
                        return;
                    default:
                        bundle.putInt(str, intValue);
                        return;
                }
            case 6:
                bundle.putLongArray(str, (long[]) obj);
                return;
            case 7:
                bundle.putLong(str, ((Number) obj).longValue());
                return;
            case 8:
                int intValue2 = ((Number) obj).intValue();
                switch (i) {
                    case 5:
                        bundle.putInt(str, intValue2);
                        return;
                    default:
                        bundle.putInt(str, intValue2);
                        return;
                }
            case 9:
                bundle.putStringArray(str, (String[]) obj);
                return;
            default:
                bundle.putString(str, (String) obj);
                return;
        }
    }

    @Override // p000a.AbstractC0929RT
    /* renamed from: P */
    public final Object mo2083P(String str, Object obj) {
        switch (this.f3196S) {
            case AbstractC0795Op.f2698E /* 0 */:
                boolean[] zArr = (boolean[]) obj;
                if (zArr != null) {
                    boolean[] m2084G = m2084G(str);
                    int length = zArr.length;
                    boolean[] copyOf = Arrays.copyOf(zArr, length + 1);
                    System.arraycopy(m2084G, 0, copyOf, length, 1);
                    return copyOf;
                }
                return m2084G(str);
            case 2:
                float[] fArr = (float[]) obj;
                if (fArr != null) {
                    float[] m2087u = m2087u(str);
                    int length2 = fArr.length;
                    float[] copyOf2 = Arrays.copyOf(fArr, length2 + 1);
                    System.arraycopy(m2087u, 0, copyOf2, length2, 1);
                    return copyOf2;
                }
                return m2087u(str);
            case 4:
                int[] iArr = (int[]) obj;
                if (iArr != null) {
                    int[] m2086o = m2086o(str);
                    int length3 = iArr.length;
                    int[] copyOf3 = Arrays.copyOf(iArr, length3 + 1);
                    System.arraycopy(m2086o, 0, copyOf3, length3, 1);
                    return copyOf3;
                }
                return m2086o(str);
            case 6:
                long[] jArr = (long[]) obj;
                if (jArr != null) {
                    long[] m2085W = m2085W(str);
                    int length4 = jArr.length;
                    long[] copyOf4 = Arrays.copyOf(jArr, length4 + 1);
                    System.arraycopy(m2085W, 0, copyOf4, length4, 1);
                    return copyOf4;
                }
                return m2085W(str);
            case 9:
                String[] strArr = (String[]) obj;
                if (strArr != null) {
                    int length5 = strArr.length;
                    Object[] copyOf5 = Arrays.copyOf(strArr, length5 + 1);
                    System.arraycopy(new String[]{str}, 0, copyOf5, length5, 1);
                    return (String[]) copyOf5;
                }
                return new String[]{str};
            default:
                return mo1955v(str);
        }
    }

    /* renamed from: Q */
    public final Integer m2088Q(String str) {
        int parseInt;
        int parseInt2;
        switch (this.f3196S) {
            case 5:
                if (str.startsWith("0x")) {
                    String substring = str.substring(2);
                    AbstractC1292YB.m2665V(16);
                    parseInt2 = Integer.parseInt(substring, 16);
                } else {
                    parseInt2 = Integer.parseInt(str);
                }
                return Integer.valueOf(parseInt2);
            default:
                if (str.startsWith("0x")) {
                    String substring2 = str.substring(2);
                    AbstractC1292YB.m2665V(16);
                    parseInt = Integer.parseInt(substring2, 16);
                } else {
                    parseInt = Integer.parseInt(str);
                }
                return Integer.valueOf(parseInt);
        }
    }

    @Override // p000a.AbstractC0929RT
    /* renamed from: h */
    public final String mo1954h() {
        switch (this.f3196S) {
            case AbstractC0795Op.f2698E /* 0 */:
                return "boolean[]";
            case 1:
                return "boolean";
            case 2:
                return "float[]";
            case 3:
                return "float";
            case 4:
                return "integer[]";
            case 5:
                return "integer";
            case 6:
                return "long[]";
            case 7:
                return "long";
            case 8:
                return "reference";
            case 9:
                return "string[]";
            default:
                return "string";
        }
    }

    @Override // p000a.AbstractC0929RT
    /* renamed from: v */
    public final Object mo1955v(String str) {
        String str2;
        long parseLong;
        boolean z = false;
        switch (this.f3196S) {
            case AbstractC0795Op.f2698E /* 0 */:
                return m2084G(str);
            case 1:
                if (AbstractC1292YB.m2695u(str, "true")) {
                    z = true;
                } else if (!AbstractC1292YB.m2695u(str, "false")) {
                    throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                }
                return Boolean.valueOf(z);
            case 2:
                return m2087u(str);
            case 3:
                return Float.valueOf(Float.parseFloat(str));
            case 4:
                return m2086o(str);
            case 5:
                return m2088Q(str);
            case 6:
                return m2085W(str);
            case 7:
                if (str.endsWith("L")) {
                    str2 = str.substring(0, str.length() - 1);
                } else {
                    str2 = str;
                }
                if (str.startsWith("0x")) {
                    String substring = str2.substring(2);
                    AbstractC1292YB.m2665V(16);
                    parseLong = Long.parseLong(substring, 16);
                } else {
                    parseLong = Long.parseLong(str2);
                }
                return Long.valueOf(parseLong);
            case 8:
                return m2088Q(str);
            case 9:
                return new String[]{str};
            default:
                if (AbstractC1292YB.m2695u(str, "null")) {
                    return null;
                }
                return str;
        }
    }

    @Override // p000a.AbstractC0929RT
    /* renamed from: z */
    public final Object mo1956z(String str, Bundle bundle) {
        int i = this.f3196S;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                return (boolean[]) bundle.get(str);
            case 1:
                return (Boolean) bundle.get(str);
            case 2:
                return (float[]) bundle.get(str);
            case 3:
                return (Float) bundle.get(str);
            case 4:
                return (int[]) bundle.get(str);
            case 5:
                switch (i) {
                    case 5:
                        return (Integer) bundle.get(str);
                    default:
                        return (Integer) bundle.get(str);
                }
            case 6:
                return (long[]) bundle.get(str);
            case 7:
                return (Long) bundle.get(str);
            case 8:
                switch (i) {
                    case 5:
                        return (Integer) bundle.get(str);
                    default:
                        return (Integer) bundle.get(str);
                }
            case 9:
                return (String[]) bundle.get(str);
            default:
                return (String) bundle.get(str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0930RU(int i, int i2) {
        super(false);
        this.f3196S = i;
    }
}
