import React from 'react';
import { KAKAO_AUTH_URL, GOOGLE_AUTH_URL} from '../constants';
import { useNavigate } from 'react-router-dom';
import style from './LoginPage.module.css';
import { motion } from 'framer-motion';
import { useEffect } from 'react';

function LoginPage(props) {
    const navigate = useNavigate();
    // useEffect(() => {
    //     if (props.location.state && props.location.state.error) {
    //         setTimeout(() => {
    //             alert(props.location.state.error, {
    //                 timeout: 5000
    //             });
    //             props.history.replace({
    //                 pathname: props.location.pathname,
    //                 state: {}
    //             });
    //         }, 100);
    //     }
    // }, [props.location.state, props.history]);
    useEffect(() =>{
        if (props.authenticated) {
            navigate('/userInfo')
        }
    },[]);

    return (

        <motion.div className={style.loginContainer}
                    initial={{ opacity: 0, scale: 0.5 }}
                    animate={{ opacity: 1, scale: 1 }}
                    transition={{duration: 0.8, delay: 0.5,ease: [0, 0.71, 0.2, 1.01]}}>
            <div className="login-content">
                {/* <p className={style.cheokchu1}>척추의 요정</p> */}
                <img src='/img/title.png'></img>
                <p className={style.cheokchu2}>데스크 워커를 위한 웹캠 기반 AI 자세 교정 서비스</p>
                <SocialLogin />
                <img src='/img/foot.png' className={style.foot}/>
                <img src='/img/helloworld.gif' className={style.helloworld}/>
            </div>
        </motion.div>
    );
}

function SocialLogin() {
    return (
        <div className={style.signInBtn}>
            <a className={style.googleBtn} href={GOOGLE_AUTH_URL}>
                <img src='/img/googleSignIn.png' alt='구글'/></a>
            <a className={style.kakaoBtn} href={KAKAO_AUTH_URL}>
                <img src='/img/KakaoSignIn.png' alt='카카오'/></a>
        </div>
    );
}



export default LoginPage;