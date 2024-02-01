package p000a;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;

/* renamed from: a.Fq */
/* loaded from: classes.dex */
public abstract class AbstractC0306Fq {
    /* renamed from: z */
    public static Cursor m649z(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
        return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
    }
}
