package p000a;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* renamed from: a.d */
/* loaded from: classes.dex */
public final class C1538d {

    /* renamed from: h */
    public static final Charset f4764h = Charset.forName("UTF-16LE");

    /* renamed from: z */
    public byte[] f4765z;

    public C1538d(byte[] bArr) {
        this.f4765z = bArr;
    }

    /* renamed from: z */
    public final boolean m2984z(C2650xz c2650xz) {
        int i;
        Charset charset;
        ByteBuffer order = ByteBuffer.wrap(this.f4765z).order(ByteOrder.LITTLE_ENDIAN);
        int i2 = 8;
        while (true) {
            if (i2 < this.f4765z.length) {
                if (order.getInt(i2) == 1835009) {
                    break;
                }
                i2 += order.getInt(i2 + 4);
            } else {
                i2 = -1;
                break;
            }
        }
        int i3 = 0;
        if (i2 < 0) {
            return false;
        }
        int i4 = i2 + 4;
        order.position(i4);
        IntBuffer asIntBuffer = order.asIntBuffer();
        int i5 = asIntBuffer.get();
        int i6 = asIntBuffer.get();
        asIntBuffer.get();
        asIntBuffer.get();
        int i7 = asIntBuffer.get() + i2;
        asIntBuffer.get();
        ArrayList arrayList = new ArrayList(i6);
        int i8 = 0;
        while (true) {
            i = 2;
            charset = f4764h;
            if (i8 >= i6) {
                break;
            }
            int i9 = asIntBuffer.get() + i7;
            arrayList.add(new String(this.f4765z, i9 + 2, order.getShort(i9) * 2, charset));
            i8++;
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        c2650xz.mo85W(strArr);
        C1805i c1805i = new C1805i();
        c1805i.write(this.f4765z, 0, i7);
        int[] iArr = new int[i6];
        int i10 = 0;
        while (i10 < i6) {
            iArr[i10] = c1805i.size() - i7;
            String str = strArr[i10];
            int length = str.length();
            ByteBuffer order2 = ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
            order2.putShort((short) length);
            c1805i.write(order2.array());
            c1805i.write(str.getBytes(charset));
            i3 = 0;
            c1805i.write(0);
            c1805i.write(0);
            i10++;
            i = 2;
        }
        C1805i.m3361z(c1805i);
        int size = (c1805i.size() - i2) - i5;
        ByteBuffer order3 = ByteBuffer.wrap(c1805i.m3364h()).order(ByteOrder.LITTLE_ENDIAN);
        order3.putInt(4, order.getInt(4) + size);
        order3.putInt(i4, size + i5);
        order3.position(i2 + 28);
        IntBuffer asIntBuffer2 = order3.asIntBuffer();
        while (i3 < i6) {
            asIntBuffer2.put(iArr[i3]);
            i3++;
        }
        int i11 = i2 + i5;
        byte[] bArr = this.f4765z;
        c1805i.write(bArr, i11, bArr.length - i11);
        this.f4765z = c1805i.toByteArray();
        return true;
    }
}
