package p000a;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;

/* renamed from: a.WG */
/* loaded from: classes.dex */
public abstract class AbstractC1190WG {
    /* renamed from: z */
    public static ParcelFileDescriptor m2458z(ContentResolver contentResolver, Uri uri, String str, CancellationSignal cancellationSignal) {
        return contentResolver.openFileDescriptor(uri, str, cancellationSignal);
    }
}
