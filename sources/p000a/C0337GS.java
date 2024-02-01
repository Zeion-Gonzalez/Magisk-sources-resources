package p000a;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: a.GS */
/* loaded from: classes.dex */
public final class C0337GS {

    /* renamed from: N */
    public final int f1139N;

    /* renamed from: P */
    public final float f1140P;

    /* renamed from: h */
    public final float f1141h;

    /* renamed from: v */
    public final float f1142v;

    /* renamed from: z */
    public final float f1143z;

    public C0337GS(Context context, XmlResourceParser xmlResourceParser) {
        this.f1143z = Float.NaN;
        this.f1141h = Float.NaN;
        this.f1142v = Float.NaN;
        this.f1140P = Float.NaN;
        this.f1139N = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0917RG.f3151G);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f1139N);
                this.f1139N = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C0561KY().m1272h((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f1140P = obtainStyledAttributes.getDimension(index, this.f1140P);
            } else if (index == 2) {
                this.f1141h = obtainStyledAttributes.getDimension(index, this.f1141h);
            } else if (index == 3) {
                this.f1142v = obtainStyledAttributes.getDimension(index, this.f1142v);
            } else if (index == 4) {
                this.f1143z = obtainStyledAttributes.getDimension(index, this.f1143z);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}
