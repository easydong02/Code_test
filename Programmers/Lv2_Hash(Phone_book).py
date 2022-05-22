def solution(phone_book):
    phone = sorted(phone_book)
    for i in range(len(phone)-1):
        if phone[i+1].startswith(phone[i]):
            return False

    return True
