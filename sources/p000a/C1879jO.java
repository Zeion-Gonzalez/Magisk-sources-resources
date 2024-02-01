package p000a;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: a.jO */
/* loaded from: classes.dex */
public final class C1879jO extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: q */
    public final /* synthetic */ C2619xH f5862q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1879jO(C2619xH c2619xH, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f5862q = c2619xH;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C1879jO(this.f5862q, interfaceC1171Vv);
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        BufferedWriter bufferedWriter;
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        AbstractC1292YB.m2664UZ(obj);
        Object[] objArr = new Object[1];
        String format = ((SimpleDateFormat) AbstractC2631xW.f8219z.getValue()).format(Long.valueOf(System.currentTimeMillis()));
        if (format == null) {
            format = "";
        }
        objArr[0] = format;
        InterfaceC0373H7 m3405F = AbstractC1843ih.m3405F(String.format("magisk_install_log_%s.log", Arrays.copyOf(objArr, 1)), true);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(AbstractC1843ih.m3410HL(m3405F.mo861z()), AbstractC2047ma.f6374z);
        if (outputStreamWriter instanceof BufferedWriter) {
            bufferedWriter = (BufferedWriter) outputStreamWriter;
        } else {
            bufferedWriter = new BufferedWriter(outputStreamWriter, 8192);
        }
        C2619xH c2619xH = this.f5862q;
        try {
            synchronized (c2619xH.f8098E) {
                Iterator it = c2619xH.f8098E.iterator();
                while (it.hasNext()) {
                    bufferedWriter.write((String) it.next());
                    bufferedWriter.newLine();
                }
            }
            AbstractC1292YB.m2659R(bufferedWriter, null);
            this.f5862q.m4500S(new C0805P0(m3405F.toString()));
            return C0329GJ.f1115z;
        } finally {
        }
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        C1879jO c1879jO = (C1879jO) mo49G((InterfaceC1725gU) obj, (InterfaceC1171Vv) obj2);
        C0329GJ c0329gj = C0329GJ.f1115z;
        c1879jO.mo50V(c0329gj);
        return c0329gj;
    }
}
