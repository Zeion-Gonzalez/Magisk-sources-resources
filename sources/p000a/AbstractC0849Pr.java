package p000a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: a.Pr */
/* loaded from: classes.dex */
public abstract class AbstractC0849Pr {

    /* renamed from: h */
    public static final Pattern f2872h;

    /* renamed from: z */
    public static final HashMap f2873z;

    static {
        HashMap hashMap = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(AbstractC0849Pr.class.getResourceAsStream("/org/commonmark/internal/util/entities.properties"), Charset.forName("UTF-8")));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        if (readLine.length() != 0) {
                            int indexOf = readLine.indexOf("=");
                            hashMap.put(readLine.substring(0, indexOf), readLine.substring(indexOf + 1));
                        }
                    } else {
                        bufferedReader.close();
                        hashMap.put("NewLine", "\n");
                        f2873z = hashMap;
                        f2872h = Pattern.compile("^&#[Xx]?");
                        return;
                    }
                } finally {
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("Failed reading data for HTML named character references", e);
        }
    }

    /* renamed from: z */
    public static String m1963z(String str) {
        Matcher matcher = f2872h.matcher(str);
        if (!matcher.find()) {
            String str2 = (String) f2873z.get(str.substring(1, str.length() - 1));
            return str2 != null ? str2 : str;
        }
        try {
            int parseInt = Integer.parseInt(str.substring(matcher.end(), str.length() - 1), matcher.end() == 2 ? 10 : 16);
            return parseInt == 0 ? "�" : new String(Character.toChars(parseInt));
        } catch (IllegalArgumentException unused) {
            return "�";
        }
    }
}
