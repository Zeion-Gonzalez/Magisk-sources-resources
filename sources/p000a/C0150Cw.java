package p000a;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: a.Cw */
/* loaded from: classes.dex */
public final class C0150Cw {

    /* renamed from: P */
    public final /* synthetic */ C0657MQ f505P;

    /* renamed from: v */
    public boolean f507v;

    /* renamed from: z */
    public final ArrayList f508z = new ArrayList();

    /* renamed from: h */
    public final ArrayDeque f506h = new ArrayDeque();

    public C0150Cw(C0657MQ c0657mq) {
        this.f505P = c0657mq;
    }

    /* renamed from: h */
    public final void m307h(boolean z) {
        this.f506h.removeLast();
        if (!this.f506h.isEmpty()) {
            return;
        }
        this.f505P.f2109h.remove();
        if (z) {
            synchronized (this.f505P.f2110v) {
                int size = this.f508z.size();
                for (int i = 0; i < size; i++) {
                    C2629xU c2629xU = (C2629xU) this.f508z.get(i);
                    AbstractC1235X4 abstractC1235X4 = (AbstractC1235X4) this.f505P.f2110v.put(c2629xU.f8216v, c2629xU.f8214P);
                    if (abstractC1235X4 != null) {
                        c2629xU.f8214P = abstractC1235X4;
                        this.f505P.f2110v.put(c2629xU.f8216v, abstractC1235X4);
                    }
                }
            }
        }
    }

    /* renamed from: z */
    public final IllegalArgumentException m308z(IllegalArgumentException illegalArgumentException) {
        if (this.f507v) {
            return illegalArgumentException;
        }
        this.f507v = true;
        ArrayDeque arrayDeque = this.f506h;
        if (arrayDeque.size() == 1 && ((C2629xU) arrayDeque.getFirst()).f8215h == null) {
            return illegalArgumentException;
        }
        StringBuilder sb = new StringBuilder(illegalArgumentException.getMessage());
        Iterator descendingIterator = arrayDeque.descendingIterator();
        while (descendingIterator.hasNext()) {
            C2629xU c2629xU = (C2629xU) descendingIterator.next();
            sb.append("\nfor ");
            sb.append(c2629xU.f8217z);
            String str = c2629xU.f8215h;
            if (str != null) {
                sb.append(' ');
                sb.append(str);
            }
        }
        return new IllegalArgumentException(sb.toString(), illegalArgumentException);
    }
}
