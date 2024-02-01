package p000a;

import java.security.AccessControlException;
import java.security.AccessController;
import java.util.Map;

/* renamed from: a.et */
/* loaded from: classes.dex */
public abstract class AbstractC1642et {

    /* renamed from: z */
    public static final ThreadLocal f5102z = new ThreadLocal();

    /* renamed from: h */
    public static boolean m3118h(String str) {
        try {
            String m3119z = m3119z(str);
            if (m3119z != null && m3119z.length() == 4) {
                if (m3119z.charAt(0) != 't' && m3119z.charAt(0) != 'T') {
                    return false;
                }
                if (m3119z.charAt(1) != 'r' && m3119z.charAt(1) != 'R') {
                    return false;
                }
                if (m3119z.charAt(2) != 'u' && m3119z.charAt(2) != 'U') {
                    return false;
                }
                if (m3119z.charAt(3) != 'e') {
                    if (m3119z.charAt(3) != 'E') {
                        return false;
                    }
                }
                return true;
            }
            return false;
        } catch (AccessControlException unused) {
            return false;
        }
    }

    /* renamed from: z */
    public static String m3119z(String str) {
        String str2;
        String str3 = (String) AccessController.doPrivileged(new C1728gY(2, str));
        if (str3 != null) {
            return str3;
        }
        Map map = (Map) f5102z.get();
        return (map == null || (str2 = (String) map.get(str)) == null) ? (String) AccessController.doPrivileged(new C1728gY(3, str)) : str2;
    }
}
