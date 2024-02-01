package p000a;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* renamed from: a.TB */
/* loaded from: classes.dex */
public final class C1023TB {

    /* renamed from: P */
    public final long f3420P;

    /* renamed from: h */
    public final int f3421h;

    /* renamed from: v */
    public final long f3422v;

    /* renamed from: z */
    public final int f3423z;

    public C1023TB(int i, int i2, long j, long j2) {
        this.f3423z = i;
        this.f3421h = i2;
        this.f3422v = j;
        this.f3420P = j2;
    }

    /* renamed from: z */
    public static C1023TB m2200z(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            C1023TB c1023tb = new C1023TB(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return c1023tb;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1023TB)) {
            return false;
        }
        C1023TB c1023tb = (C1023TB) obj;
        return this.f3421h == c1023tb.f3421h && this.f3422v == c1023tb.f3422v && this.f3423z == c1023tb.f3423z && this.f3420P == c1023tb.f3420P;
    }

    /* renamed from: h */
    public final void m2201h(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f3423z);
            dataOutputStream.writeInt(this.f3421h);
            dataOutputStream.writeLong(this.f3422v);
            dataOutputStream.writeLong(this.f3420P);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f3421h), Long.valueOf(this.f3422v), Integer.valueOf(this.f3423z), Long.valueOf(this.f3420P));
    }
}
