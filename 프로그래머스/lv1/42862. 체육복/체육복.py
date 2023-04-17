def solution(n, lost, reserve):
    # set함수로 중복제거
    reserve_set = set(reserve) - set(lost)
    lost_set = set(lost) -set(reserve)
    
    # 여분갯수를 앞뒤의 부족한 학생에게 모두 돌리기 
    # (한 학생은 한명에게만 여분을 줄 수 있음)
    for reserve in reserve_set:
        front = reserve -1
        back = reserve +1
        if front in lost_set:
            lost_set.remove(front)
        elif back in lost_set:
            lost_set.remove(back)
    
    return n - len(lost_set)