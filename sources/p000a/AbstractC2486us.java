package p000a;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: a.us */
/* loaded from: classes.dex */
public abstract class AbstractC2486us extends AbstractC2708z8 {
    /* renamed from: EQ */
    public static String m4276EQ(Iterable iterable, String str, String str2, String str3, InterfaceC2364sT interfaceC2364sT, int i) {
        String str4;
        String str5;
        int i2;
        CharSequence charSequence;
        InterfaceC2364sT interfaceC2364sT2;
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str6 = str;
        if ((i & 2) != 0) {
            str4 = "";
        } else {
            str4 = str2;
        }
        if ((i & 4) != 0) {
            str5 = "";
        } else {
            str5 = str3;
        }
        if ((i & 8) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        int i3 = i2;
        if ((i & 16) != 0) {
            charSequence = "...";
        } else {
            charSequence = null;
        }
        if ((i & 32) != 0) {
            interfaceC2364sT2 = null;
        } else {
            interfaceC2364sT2 = interfaceC2364sT;
        }
        StringBuilder sb = new StringBuilder();
        m4295yF(iterable, sb, str6, str4, str5, i3, charSequence, interfaceC2364sT2);
        return sb.toString();
    }

    /* renamed from: Fu */
    public static final Object m4277Fu(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    /* renamed from: KM */
    public static final Set m4278KM(ArrayList arrayList) {
        Object next;
        boolean z = arrayList instanceof Collection;
        C1460bR c1460bR = C1460bR.f4549S;
        if (z) {
            int size = arrayList.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC0438II.m990C(arrayList.size()));
                    m4279LN(arrayList, linkedHashSet);
                    return linkedHashSet;
                }
                if (arrayList instanceof List) {
                    next = arrayList.get(0);
                } else {
                    next = arrayList.iterator().next();
                }
                return Collections.singleton(next);
            }
            return c1460bR;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        m4279LN(arrayList, linkedHashSet2);
        int size2 = linkedHashSet2.size();
        if (size2 != 0) {
            if (size2 != 1) {
                return linkedHashSet2;
            }
            return Collections.singleton(linkedHashSet2.iterator().next());
        }
        return c1460bR;
    }

    /* renamed from: LN */
    public static final void m4279LN(Iterable iterable, AbstractCollection abstractCollection) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    /* renamed from: M6 */
    public static final ArrayList m4280M6(Iterable iterable, Collection collection) {
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            AbstractC2708z8.m4637oI(iterable, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    /* renamed from: O4 */
    public static final Object m4281O4(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    /* renamed from: Rh */
    public static final Comparable m4282Rh(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    /* renamed from: Ry */
    public static final Object m4283Ry(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(AbstractC1292YB.m2642C(list));
    }

    /* renamed from: S3 */
    public static final List m4284S3(Iterable iterable) {
        Object next;
        boolean z = iterable instanceof Collection;
        C1239X8 c1239x8 = C1239X8.f4021S;
        if (z) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return new ArrayList(collection);
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = iterable.iterator().next();
                }
                return Collections.singletonList(next);
            }
            return c1239x8;
        }
        List m4291hs = m4291hs(iterable);
        ArrayList arrayList = (ArrayList) m4291hs;
        int size2 = arrayList.size();
        if (size2 != 0) {
            if (size2 != 1) {
                return m4291hs;
            }
            return Collections.singletonList(arrayList.get(0));
        }
        return c1239x8;
    }

    /* renamed from: T0 */
    public static final ArrayList m4285T0(Collection collection, Object obj) {
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    /* renamed from: W9 */
    public static final int[] m4286W9(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    /* renamed from: d2 */
    public static final boolean m4287d2(Iterable iterable, Object obj) {
        int i;
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (iterable instanceof List) {
            i = ((List) iterable).indexOf(obj);
        } else {
            Iterator it = iterable.iterator();
            int i2 = 0;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (i2 >= 0) {
                        if (AbstractC1292YB.m2695u(obj, next)) {
                            i = i2;
                            break;
                        }
                        i2++;
                    } else {
                        AbstractC1292YB.m2699zx();
                        throw null;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
        }
        if (i < 0) {
            return false;
        }
        return true;
    }

    /* renamed from: d3 */
    public static final Object m4288d3(int i, List list) {
        if (i < 0 || i > AbstractC1292YB.m2642C(list)) {
            return null;
        }
        return list.get(i);
    }

    /* renamed from: dG */
    public static final Object m4289dG(Collection collection) {
        if (collection instanceof List) {
            return m4281O4((List) collection);
        }
        Iterator it = collection.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: fH */
    public static final List m4290fH(List list, int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C1239X8 c1239x8 = C1239X8.f4021S;
            if (i == 0) {
                return c1239x8;
            }
            if (i >= list.size()) {
                return m4284S3(list);
            }
            if (i == 1) {
                return Collections.singletonList(m4289dG(list));
            }
            ArrayList arrayList = new ArrayList(i);
            Iterator it = list.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                arrayList.add(it.next());
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            int size = arrayList.size();
            if (size != 0) {
                if (size != 1) {
                    return arrayList;
                }
                return Collections.singletonList(arrayList.get(0));
            }
            return c1239x8;
        }
        throw new IllegalArgumentException(AbstractC2441tz.m4190Q("Requested element count ", i, " is less than zero.").toString());
    }

    /* renamed from: hs */
    public static final List m4291hs(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        m4279LN(iterable, arrayList);
        return arrayList;
    }

    /* renamed from: j5 */
    public static final List m4292j5(List list) {
        if ((list instanceof Collection) && list.size() <= 1) {
            return m4284S3(list);
        }
        List m4291hs = m4291hs(list);
        Collections.reverse(m4291hs);
        return m4291hs;
    }

    /* renamed from: nB */
    public static final Object m4293nB(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: yF */
    public static final void m4295yF(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, InterfaceC2364sT interfaceC2364sT) {
        sb.append(charSequence2);
        int i2 = 0;
        for (Object obj : iterable) {
            i2++;
            if (i2 > 1) {
                sb.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            } else {
                AbstractC0438II.m1009Q(sb, obj, interfaceC2364sT);
            }
        }
        if (i >= 0 && i2 > i) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    /* renamed from: zd */
    public static final List m4296zd(ArrayList arrayList, Comparator comparator) {
        if (arrayList.size() <= 1) {
            return m4284S3(arrayList);
        }
        Object[] array = arrayList.toArray(new Object[0]);
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return Arrays.asList(array);
    }
}
