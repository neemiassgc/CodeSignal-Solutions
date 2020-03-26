def reverseSentence(sentence):
    list = sentence.split(" ")
    i, out = list.__len__() - 1, ""
    while i >= 0:
        out += list[i] + " "
        i -= 1
    return out[0:-1]