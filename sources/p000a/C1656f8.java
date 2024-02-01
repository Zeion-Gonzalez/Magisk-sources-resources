package p000a;

import android.net.Uri;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: a.f8 */
/* loaded from: classes.dex */
public final class C1656f8 extends AbstractC1021T9 implements InterfaceC1459bP {

    /* renamed from: R */
    public final /* synthetic */ int f5191R;

    /* renamed from: w */
    public final /* synthetic */ C2127o8 f5192w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1656f8(C2127o8 c2127o8, int i) {
        super(0);
        this.f5191R = i;
        this.f5192w = c2127o8;
    }

    /* renamed from: h */
    public final Pattern m3129h() {
        int i = this.f5191R;
        C2127o8 c2127o8 = this.f5192w;
        switch (i) {
            case 2:
                String str = (String) c2127o8.f6548V.getValue();
                if (str == null) {
                    return null;
                }
                return Pattern.compile(str, 2);
            case 5:
                String str2 = c2127o8.f6546R;
                if (str2 == null) {
                    return null;
                }
                return Pattern.compile(str2);
            default:
                String str3 = c2127o8.f6543N;
                if (str3 == null) {
                    return null;
                }
                return Pattern.compile(str3, 2);
        }
    }

    @Override // p000a.InterfaceC1459bP
    /* renamed from: z */
    public final Object mo93z() {
        boolean z;
        List list;
        int i = this.f5191R;
        boolean z2 = true;
        C2127o8 c2127o8 = this.f5192w;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                C0084Bc c0084Bc = (C0084Bc) c2127o8.f6540G.getValue();
                if (c0084Bc == null || (list = (List) c0084Bc.f329S) == null) {
                    return new ArrayList();
                }
                return list;
            case 1:
                String str = c2127o8.f6555z;
                if (str == null || Uri.parse(str).getFragment() == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                String fragment = Uri.parse(str).getFragment();
                StringBuilder sb = new StringBuilder();
                C2127o8.m3742z(fragment, arrayList, sb);
                return new C0084Bc(arrayList, sb.toString());
            case 2:
                return m3129h();
            case 3:
                C0084Bc c0084Bc2 = (C0084Bc) c2127o8.f6540G.getValue();
                if (c0084Bc2 == null) {
                    return null;
                }
                return (String) c0084Bc2.f328R;
            case 4:
                String str2 = c2127o8.f6555z;
                if (str2 == null || Uri.parse(str2).getQuery() == null) {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 5:
                return m3129h();
            case 6:
                return m3129h();
            default:
                c2127o8.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (((Boolean) c2127o8.f6552u.getValue()).booleanValue()) {
                    String str3 = c2127o8.f6555z;
                    Uri parse = Uri.parse(str3);
                    for (String str4 : parse.getQueryParameterNames()) {
                        StringBuilder sb2 = new StringBuilder();
                        List<String> queryParameters = parse.getQueryParameters(str4);
                        if (queryParameters.size() <= 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            String str5 = (String) AbstractC2486us.m4293nB(queryParameters);
                            if (str5 == null) {
                                c2127o8.f6549W = true;
                                str5 = str4;
                            }
                            Matcher matcher = C2127o8.f6538k.matcher(str5);
                            C1772hK c1772hK = new C1772hK();
                            int i2 = 0;
                            while (matcher.find()) {
                                c1772hK.f5573h.add(matcher.group(1));
                                sb2.append(Pattern.quote(str5.substring(i2, matcher.start())));
                                sb2.append("(.+?)?");
                                i2 = matcher.end();
                            }
                            if (i2 < str5.length()) {
                                sb2.append(Pattern.quote(str5.substring(i2)));
                            }
                            c1772hK.f5574z = AbstractC1269Xn.m2588hs(sb2.toString(), ".*", "\\E.*\\Q");
                            linkedHashMap.put(str4, c1772hK);
                        } else {
                            throw new IllegalArgumentException(("Query parameter " + str4 + " must only be present once in " + str3 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                        }
                    }
                }
                return linkedHashMap;
        }
    }
}
