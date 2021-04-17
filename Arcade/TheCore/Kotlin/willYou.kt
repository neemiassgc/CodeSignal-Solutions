fun willYou(young: Boolean, beautiful: Boolean, loved: Boolean) =
    (young && beautiful && !loved) ||
        (loved && (!young || !beautiful))