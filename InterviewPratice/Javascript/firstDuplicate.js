const firstDuplicate = (a) => {
    for(let i = 0; i < a.length; i++) {
        if(a[Math.abs(a[i]) - 1] < 0) return Math.abs(a[i]);
        a[Math.abs(a[i]) - 1] = -a[Math.abs(a[i]) - 1];
    }
    return -1;
}