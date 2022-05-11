def solution(priorities, location):
    # 딕종너리로 만듦
    dict_ = {i : priorities[i] for i in range(len(priorities))}

    # 원하는 문서 인쇄 순서
    answer=0

    # 최종 인쇄 순서 딕셔너리
    result ={}

    while True:
        # 종료 조건
        if len(dict_)==0:
            break

        #  처음, 마지막 키값
        key_f,key_l = next(iter(dict_)), len(priorities)

        #유배 작업 체크 변수
        check = False

        #첫번째거를 나머지비교
        first = dict_[key_f]
        for a,b in dict_.items():
            if b> first:
                check=True
        
        # 유배 작업
        if check:
            temp_v = dict_.pop(key_f)
            dict_[key_f +len(priorities)] = temp_v
             # 처음, 마지막 키값 1증가
        # 더 큰 거 없으면 인쇄
        else:
            temp=dict_.pop(key_f)
            result[key_f%len(priorities)] = temp

    #원하는 문서 출력 순서
    for a,b in result.items():
        answer +=1
        if a==location:
            return answer
    
solution([1, 1, 9, 1, 1, 1],0)
