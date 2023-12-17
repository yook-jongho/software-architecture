import { useState, useEffect } from "react";
import axios from "axios";

const useHttpGet = (url) => {
    const [data, setData] = useState(null);
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState(null);

    useEffect(() => {
        const fetchData = async () => {
            try {
                const response = await axios.get(url);
                setData(response.data);
            } catch (error) {
                setError(error);
            } finally {
                setLoading(false);
            }
        };

        fetchData(); // fetchData 함수를 호출하여 데이터를 가져옴
    }, [url]); // url이 변경될 때마다 useEffect가 실행됨

    return { data, loading, error };
};

export default useHttpGet;
