package p000a;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* renamed from: a.HD */
/* loaded from: classes.dex */
public final class C0378HD {

    /* renamed from: P */
    public Object f1292P;

    /* renamed from: h */
    public int f1293h;

    /* renamed from: v */
    public final Object f1294v;

    /* renamed from: z */
    public int f1295z;

    public C0378HD(C1997lY c1997lY, C2709z9 c2709z9) {
        this.f1294v = new SparseArray();
        this.f1292P = c1997lY;
        this.f1295z = c2709z9.m4646W(28, 0);
        this.f1293h = c2709z9.m4646W(52, 0);
    }

    public C0378HD(Context context, XmlResourceParser xmlResourceParser) {
        this.f1294v = new ArrayList();
        this.f1293h = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0917RG.f3157o);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f1295z = obtainStyledAttributes.getResourceId(index, this.f1295z);
            } else if (index == 1) {
                this.f1293h = obtainStyledAttributes.getResourceId(index, this.f1293h);
                String resourceTypeName = context.getResources().getResourceTypeName(this.f1293h);
                context.getResources().getResourceName(this.f1293h);
                if ("layout".equals(resourceTypeName)) {
                    C0561KY c0561ky = new C0561KY();
                    this.f1292P = c0561ky;
                    c0561ky.m1272h((ConstraintLayout) LayoutInflater.from(context).inflate(this.f1293h, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
