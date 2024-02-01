package p000a;

import android.system.Os;
import android.system.StructUtsname;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Map;

/* renamed from: a.WW */
/* loaded from: classes.dex */
public final class C1205WW extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: q */
    public final /* synthetic */ C1688fk f3917q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1205WW(C1688fk c1688fk, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f3917q = c1688fk;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C1205WW(this.f3917q, interfaceC1171Vv);
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
        InterfaceC0373H7 m3405F = AbstractC1843ih.m3405F(String.format("magisk_log_%s.log", Arrays.copyOf(objArr, 1)), true);
        OutputStream m3410HL = AbstractC1843ih.m3410HL(m3405F.mo861z());
        Charset charset = AbstractC2047ma.f6374z;
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(m3410HL, charset);
        if (outputStreamWriter instanceof BufferedWriter) {
            bufferedWriter = (BufferedWriter) outputStreamWriter;
        } else {
            bufferedWriter = new BufferedWriter(outputStreamWriter, 8192);
        }
        try {
            bufferedWriter.write("---Detected Device Info---\n\n");
            bufferedWriter.write("isAB=" + C1910jw.f5963o + "\n");
            bufferedWriter.write("isSAR=" + C1910jw.f5957Q + "\n");
            bufferedWriter.write("ramdisk=" + C1910jw.f5952G + "\n");
            StructUtsname uname = Os.uname();
            bufferedWriter.write("kernel=" + uname.sysname + " " + uname.machine + " " + uname.release + " " + uname.version + "\n");
            bufferedWriter.write("\n\n---System Properties---\n\n");
            InputStreamReader inputStreamReader = new InputStreamReader(new ProcessBuilder("getprop").start().getInputStream(), charset);
            try {
                AbstractC0438II.m1042q(inputStreamReader, bufferedWriter);
                AbstractC1292YB.m2659R(inputStreamReader, null);
                bufferedWriter.write("\n\n---Environment Variables---\n\n");
                for (Map.Entry<String, String> entry : System.getenv().entrySet()) {
                    bufferedWriter.write(entry.getKey() + "=" + entry.getValue() + "\n");
                }
                bufferedWriter.write("\n\n---System MountInfo---\n\n");
                FileInputStream fileInputStream = new FileInputStream("/proc/self/mountinfo");
                Charset charset2 = AbstractC2047ma.f6374z;
                inputStreamReader = new InputStreamReader(fileInputStream, charset2);
                try {
                    AbstractC0438II.m1042q(inputStreamReader, bufferedWriter);
                    AbstractC1292YB.m2659R(inputStreamReader, null);
                    bufferedWriter.write("\n---Magisk Logs---\n");
                    bufferedWriter.write(C1910jw.m3543z().f1386z + " (" + C1910jw.m3543z().f1385v + ")\n\n");
                    boolean z = C1910jw.m3543z().f1382N;
                    C1688fk c1688fk = this.f3917q;
                    if (z) {
                        bufferedWriter.write(c1688fk.f5289Y);
                    }
                    bufferedWriter.write("\n---Manager Logs---\n");
                    bufferedWriter.write("26.4 (26400)\n\n");
                    inputStreamReader = new InputStreamReader(new ProcessBuilder("logcat", "-d").start().getInputStream(), charset2);
                    try {
                        AbstractC0438II.m1042q(inputStreamReader, bufferedWriter);
                        AbstractC1292YB.m2659R(inputStreamReader, null);
                        AbstractC1292YB.m2659R(bufferedWriter, null);
                        c1688fk.m4500S(new C0805P0(m3405F.toString()));
                        return C0329GJ.f1115z;
                    } finally {
                    }
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        } finally {
        }
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        C1205WW c1205ww = (C1205WW) mo49G((InterfaceC1725gU) obj, (InterfaceC1171Vv) obj2);
        C0329GJ c0329gj = C0329GJ.f1115z;
        c1205ww.mo50V(c0329gj);
        return c0329gj;
    }
}
