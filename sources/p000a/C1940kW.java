package p000a;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: a.kW */
/* loaded from: classes.dex */
public final /* synthetic */ class C1940kW implements FilenameFilter {

    /* renamed from: z */
    public final /* synthetic */ int f6023z;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f6023z) {
            case AbstractC0795Op.f2698E /* 0 */:
                if (str.startsWith("lib") && str.endsWith(".so")) {
                    return true;
                }
                return false;
            default:
                return str.endsWith(".md");
        }
    }
}
