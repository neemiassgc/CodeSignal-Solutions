function willYou(young, beautiful, loved) {
    return (young && beautiful && !loved) ||
        (loved && (!young || !beautiful));
}