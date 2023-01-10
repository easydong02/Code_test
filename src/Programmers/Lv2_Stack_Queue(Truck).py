import numpy as np

def solution(bridge_length, weight, truck_weights):
    on_bridge = []
    on_time = np.array([])
    tic =0


    while True:
        # 다리에 자리 있으면 차 반입 시도
        if  len(on_bridge) < bridge_length :
            
            # 무게되면 차 반입 + 나갈 수 있으면 차 반출
            if sum(on_bridge) + truck_weights[0] <=weight :
                on_bridge.append(truck_weights.pop(0))
                on_time = np.append(on_time, 0)
                if on_time[0] >=bridge_length :
                    on_bridge.pop(0)
                    on_time = np.delete(on_time,0)

            # 그렇지 않고 선입차 나갈 수 있으면 차 반출 + 대기열 차 반입
            elif on_time[0] >=bridge_length :
                on_bridge.pop(0)
                on_time = np.delete(on_time,0)

                if sum(on_bridge) + truck_weights[0] <=weight :
                    on_bridge.append(truck_weights.pop(0))
                    on_time = np.append(on_time, 0)

        # 그렇지 않으면 다리 꽉참 -> 맨 앞 하나 뺌 + (무게 되면)대기열에서 하나 들임
        else:
            on_bridge.pop(0)
            on_time = np.delete(on_time,0)
            if sum(on_bridge) + truck_weights[0] <=weight :
                on_bridge.append(truck_weights.pop(0))
                on_time = np.append(on_time, 0)

        # tic은 다리에 차를 넣어도, 넣지 않아도 차들은 움직이고 시간은 흐름
        tic +=1
        on_time +=1
        
        # 합산
        if len(truck_weights) ==0:
            tic += bridge_length
            break
        

    answer=tic
    return answer
