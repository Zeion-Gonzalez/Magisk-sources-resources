package p000a;

import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: a.GC */
/* loaded from: classes.dex */
public abstract class AbstractC0323GC {

    /* renamed from: N */
    public static final C1665fK f1096N;

    /* renamed from: P */
    public static final Pattern f1097P;

    /* renamed from: v */
    public static final char[] f1099v;

    /* renamed from: z */
    public static final Pattern f1100z = Pattern.compile("[\\\\&]");

    /* renamed from: h */
    public static final Pattern f1098h = Pattern.compile("\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    static {
        Pattern.compile("(%[a-fA-F0-9]{0,2}|[^:/?#@!$&'()*+,;=a-zA-Z0-9\\-._~])");
        f1099v = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        f1097P = Pattern.compile("[ \t\r\n]+");
        f1096N = new C1665fK(4);
    }

    /* renamed from: z */
    public static String m720z(String str) {
        if (f1100z.matcher(str).find()) {
            Matcher matcher = f1098h.matcher(str);
            if (matcher.find()) {
                StringBuilder sb = new StringBuilder(str.length() + 16);
                int i = 0;
                do {
                    sb.append((CharSequence) str, i, matcher.start());
                    String group = matcher.group();
                    switch (f1096N.f5200S) {
                        case 4:
                            if (group.charAt(0) == '\\') {
                                sb.append((CharSequence) group, 1, group.length());
                                break;
                            } else {
                                sb.append(AbstractC0849Pr.m1963z(group));
                                break;
                            }
                        default:
                            if (group.startsWith("%")) {
                                if (group.length() == 3) {
                                    sb.append(group);
                                    break;
                                } else {
                                    sb.append("%25");
                                    sb.append((CharSequence) group, 1, group.length());
                                    break;
                                }
                            } else {
                                for (byte b : group.getBytes(Charset.forName("UTF-8"))) {
                                    sb.append('%');
                                    char[] cArr = f1099v;
                                    sb.append(cArr[(b >> 4) & 15]);
                                    sb.append(cArr[b & 15]);
                                }
                                break;
                            }
                    }
                    i = matcher.end();
                } while (matcher.find());
                if (i != str.length()) {
                    sb.append((CharSequence) str, i, str.length());
                }
                return sb.toString();
            }
            return str;
        }
        return str;
    }
}
