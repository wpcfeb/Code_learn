def multiply(*args):
    print(args)
    total = 1
    for arg in args:
        total = total * arg

    return total

def bug_apply(*args, operator):
    if operator == "*":
        return multiply(args) # ((1, 3, 6, 7),)  pass one tuple
def debug_apply(*args, operator):
    if operator == "*":
        return multiply(*args) # unpacking: pass different argument

print(debug_apply(1, 3, 6, 7 ,operator="*"))